import javax.lang.model.util.Elements;
import javax.swing.text.html.parser.Element;

public interface Picture {
    void print();

    public String url();
    void add(Element element);

    void remove(Element element);

    void remove(Elements element);

    Element get(int index);
}
