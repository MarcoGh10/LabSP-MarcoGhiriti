package models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> listOfAuthors = new ArrayList<>();

    public Book() {
        super();
    }

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        this.listOfAuthors.add(author);
    }

    public void addContent(Elements elements) {
        super.add(elements);
    }

    public void print() {
        for (Author author : listOfAuthors) {
            author.print();
        }
        System.out.print("models.Book title: ");
        super.print();
    }


}