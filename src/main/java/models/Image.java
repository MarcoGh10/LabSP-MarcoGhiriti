package models;

public class Image implements Elements {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void add(Elements e) {

    }

    @Override
    public void remove(Elements e) {

    }
    public Elements get(int index) {
        return null;
    }

    public void print() {
        System.out.println(url);
    }

}