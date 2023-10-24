public class Chapter {
    private String name;

    public Chapter(String name) {
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
        return "Chapter{" +
                "name='" + name + '\'' +
                '}';
    }
}