import javax.swing.text.html.parser.Element;
import java.awt.*;

public interface Picture {
    void print();

    public String url();

    Dimension dim();


    void add(Element element);

    void remove(Element element);

    void add(javax.lang.model.element.Element element);

    void remove(javax.lang.model.element.Element element);

    Element get(int index);
}
