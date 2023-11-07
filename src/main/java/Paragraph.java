public class Paragraph implements Element, AlignStrategy {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print() {
        System.out.print("Paragraph: ");
        System.out.println(text);
    }

    @Override
    public String render(Paragraph paragraph, Context context) {
        return null;
    }
}