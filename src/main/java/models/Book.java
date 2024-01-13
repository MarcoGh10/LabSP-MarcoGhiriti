package models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authorList = new ArrayList<Author>();
    private List<Elements> elementsList = new ArrayList<Elements>();

    public Book(String s) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authorList.add(author);
    }

    public void addContent(Elements element) {
        elementsList.add(element);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public List<Elements> getElementsList() {
        return elementsList;
    }

    public void setElementsList(List<Elements> elementsList) {
        this.elementsList = elementsList;
    }

    public void print() {
        System.out.print("Book: ");
        System.out.println(title);
        authorList.forEach(e -> e.print());
        elementsList.forEach(e -> e.print());
    }
}