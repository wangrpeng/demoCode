package com.example.mode.decorator;

/**
 * @author MyPC
 * @Description
 * @create 2020-05-09 15:11
 */
public abstract class NodeDecorator implements TextNode{

    public final TextNode target;


    public NodeDecorator(TextNode textNode) {
        this.target = textNode;
    }


    @Override
    public void setTextNode(String text) {
        this.target.setTextNode(text);
    }
}
