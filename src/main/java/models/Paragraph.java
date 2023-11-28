package models;

import service.AlignCenter;
import service.AlignStrategy;

public class Paragraph implements Elements, AlignStrategy {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void add(Elements e) {

    }

    @Override
    public Elements getElement() {
        return Elements.super.getElement();
    }

    @Override
    public void remove(Elements e) {

    }

    @Override
    public Elements get(int index) {
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print() {
        System.out.print("models.Paragraph: ");
        System.out.println(text);
    }

    @Override
    public String render(Paragraph paragraph, Context context) {
        return null;
    }

    @Override
    public void setAlignStrategy(AlignCenter alignCenter) {

    }
}