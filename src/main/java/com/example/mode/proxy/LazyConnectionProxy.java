package com.example.mode.proxy;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.function.Supplier;

/**
 * @author SimonWang
 * @Description
 * @create 2020-05-11 11:13
 */
public class LazyConnectionProxy extends AbstractConnectionProxy {

    private Supplier<Connection> supplier;
    private Connection target = null;


    public LazyConnectionProxy(Supplier<Connection> supplier) {
        this.supplier = supplier;
    }

    @Override
    protected Connection getRealConnection() {
        if (target == null) {
            return supplier.get();
        }
        return target;
    }

    // 覆写close方法：只有target不为null时才需要关闭:
    public void close() throws SQLException {
        if (target != null) {
            System.out.println("Close connection: " + target);
            super.close();
        }
    }
}
