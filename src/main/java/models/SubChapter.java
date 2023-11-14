package models;

public class SubChapter {
    private String name;

    public SubChapter(String name) {
        this.name = name;
    }

    private void print() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "models.SubChapter{" +
                "name='" + name + '\'' +
                '}';
    }
}