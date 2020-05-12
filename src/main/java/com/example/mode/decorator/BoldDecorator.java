package com.example.mode.decorator;

/**
 * @author SimonWang
 * @Description
 * @create 2020-05-09 15:20
 */
public class BoldDecorator extends NodeDecorator{

    public BoldDecorator(TextNode textNode) {
        super(textNode);
    }


    @Override
    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }
}
