public class Paragraph {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    private void print() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }
}