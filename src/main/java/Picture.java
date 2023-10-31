import javax.swing.text.html.parser.Element;

public interface Picture {
    void print();

    public String url();
    void add(Element element);

    void remove(Element element);

    Element get(int index);
}
