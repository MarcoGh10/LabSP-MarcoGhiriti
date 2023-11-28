package models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Elements {
    private String title;
    List<Elements> elementList = new ArrayList<Elements>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Elements e) {
        elementList.add(e);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Elements> getElementList() {
        return elementList;
    }

    public void setElementList(List<Elements> elementList) {
        this.elementList = elementList;
    }

    @Override
    public void remove(Elements e) {
        elementList.remove(e);
    }

    public void print() {
        System.out.println(title);
        for (Elements element : elementList) {
            element.print();
        }
    }

}