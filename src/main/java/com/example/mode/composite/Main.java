package com.example.mode.composite;

/**
 * @author SimonWang
 * @Description 组合模式（Composite）
 * 将对象组合成树形结构以表示"部分-整体"的层次结构,使用户对单个对象和组合对象的使用具有一致性.
 * 经常用于树形结构 例如: xml 文件夹和文件 GUI窗口的各种组件
 * Composite模式使得叶子对象和容器对象具有一致性，从而形成统一的树形结构，并用一致的方式去处理它们。
 * @create 2020-05-12 14:29
 */
public class Main {
    public static void main(String[] args) {
        Node root = new ElementNode("school");
        root.add(new ElementNode("classA")
                .add(new TextNode("Tom"))
                .add(new TextNode("Alice")));
        root.add(new ElementNode("classB")
                .add(new TextNode("Bob"))
                .add(new TextNode("Grace"))
                .add(new CommentNode("comment...")));
        System.out.println(root.toXml());

    }

}
