package models;

public interface Elements {
    void add(Elements e);

    default Elements getElement() {
        return this;
    }

    ;

    void remove(Elements e);

    void print();
}