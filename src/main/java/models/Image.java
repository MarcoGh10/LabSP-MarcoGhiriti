package models;

public class Image implements Elements {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void add(Elements e) {

    }

    @Override
    public void remove(Elements e) {

    }

    @Override
    public Elements get(int index) {
        return null;
    }

    public void print() {
        System.out.println(url);
    }

}