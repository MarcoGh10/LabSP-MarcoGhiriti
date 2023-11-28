package models;

public interface Elements {
    void add(Elements e);

    default Elements getElement() {
        return this;
    }

    ;

    void remove(Elements e);

    Elements get(int index);

    void print();
}