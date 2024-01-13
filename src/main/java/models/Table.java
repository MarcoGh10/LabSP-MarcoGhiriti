package models;

import lombok.Data;

@Data
public class Table implements Elements {
    private String something;

    public Table(String something) {
        this.something = something;
    }

    public void print() {
        System.out.println("Something: " + something);
    }

    @Override
    public void add(Elements element) {

    }

    @Override
    public void remove(Elements element) {

    }

    @Override
    public Elements get(int id) {
        return null;
    }


    public void accept(Visitor v) {
        v.visitTable(this);
    }
}