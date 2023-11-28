package models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Elements {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Elements> getListOfElements() {
        return listOfElements;
    }

    public void setListOfElements(List<Elements> listOfElements) {
        this.listOfElements = listOfElements;
    }

    private List<Elements> listOfElements = new ArrayList<>();

    public Section() {
        this.title = null;
    }

    public Section(String title) {
        this.title = title;
    }

    public Section(String title, List<Elements> listOfElements) {
        this.title = title;
        this.listOfElements = listOfElements;
    }

    @Override
    public Elements clone() {
        return new Section(this.title, this.listOfElements);
    }

    public void print() {
        System.out.println(title);
        for (Elements elements : listOfElements) {
            elements.print();
        }
    }

    public void add(Elements elements) {
        this.listOfElements.add(elements);
    }

    public void remove(Elements elements) {
        this.listOfElements.remove(elements);
    }

    public Elements get(int index) {
        return this.listOfElements.get(index);
    }
}