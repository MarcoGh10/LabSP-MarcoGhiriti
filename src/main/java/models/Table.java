package models;

public class Table {

    private Long id;
    private String tableContent;
    private SubChapter subChapter;

    public Table(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "models.Table{" +
                "id=" + id +
                ", tableContent='" + tableContent + '\'' +
                ", subChapter=" + subChapter +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private class SubChapter {
    }
    // Other table-related properties and methods
}
