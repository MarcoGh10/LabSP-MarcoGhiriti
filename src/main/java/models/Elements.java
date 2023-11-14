package models;

public interface Elements {
    public void print();

    public void add(Elements elements);

    public void remove(Elements elements);

    public Elements get(int index);
}