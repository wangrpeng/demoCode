package com.example.mode.decorator;

/**
 * @author SimonWang
 * @Description
 * @create 2020-05-09 15:48
 */
public class UnderlineDecorator extends NodeDecorator {


    public UnderlineDecorator(TextNode textNode) {
        super(textNode);
    }

    @Override
    public String getText() {
        return "<u>" + target.getText() +
                "</u>";
    }
}
