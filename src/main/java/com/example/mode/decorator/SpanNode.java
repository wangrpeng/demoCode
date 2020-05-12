package com.example.mode.decorator;

public class SpanNode implements TextNode{

    private  String text;


    @Override
    public void setTextNode(String text) {
        this.text = text;
    }


    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}
