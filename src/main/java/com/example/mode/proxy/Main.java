package com.example.mode.proxy;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author SimonWang
 * @Description 虚拟代理:
 * 虚代理即Virtual Proxy，它让调用者先持有一个代理对象，但真正的对象尚未创建。如果没有必要，这个真正的对象是不会被创建的，
 * 直到客户端需要真的必须调用时，才创建真正的对象。JDBC的连接池返回的JDBC连接（Connection对象）就可以是一个虚代理，
 * 即获取连接时根本没有任何实际的数据库连接，直到第一次执行JDBC查询或更新操作时，才真正创建实际的JDBC连接。
 * 远程代理:
 * 远程代理即Remote Proxy，本地的调用者持有的接口实际上是一个代理，这个代理负责把对接口的方法访问转换成远程调用，
 * 然后返回结果。Java内置的RMI机制就是一个完整的远程代理模式。
 * 保护代理:
 * 保护代理即Protection Proxy，它用代理对象控制对原始对象的访问，常用于鉴权。
 * 智能引用
 * 智能引用即Smart Reference，它也是一种代理对象，如果有很多客户端对它进行访问，通过内部的计数器可以在外部调用者都不使用后自动释放它。
 * @create 2020-05-11 11:09
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:mysql://192.168.35.227:3308/test";
        String jdbcName = "infuser";
        String jdbcPassword = "infuser";
        DataSource lazyDataSource = new LazyDataSource(jdbcUrl, jdbcName, jdbcPassword);
        System.out.println("get lazy connection...");
        try (Connection conn1 = lazyDataSource.getConnection()) {
            // 并没有实际打开真正的Connection
        }
        System.out.println("get lazy connection...");
        try (Connection conn2 = lazyDataSource.getConnection()) {
            try (PreparedStatement ps = conn2.prepareStatement("SELECT * FROM interest_crawler LIMIT 1")) { // 打开了真正的Connection
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getString("stock_name"));
                    }
                }
            }
        }
    }
}
