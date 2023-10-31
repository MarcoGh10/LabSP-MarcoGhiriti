import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private String title;
    private List<Element> listOfElements = new ArrayList<>();

    public Section() {
        this.title = null;
    }

    public Section(String title) {
        this.title = title;
    }

    public Section(String title, List<Element> listOfElements) {
        this.title = title;
        this.listOfElements = listOfElements;
    }

    @Override
    public Element clone() {
        return new Section(this.title, this.listOfElements);
    }

    public void print() {
        System.out.println(title);
        for (Element element : listOfElements) {
            element.print();
        }
    }

    public void add(Element element) {
        this.listOfElements.add(element);
    }

    public void remove(Element element) {
        this.listOfElements.remove(element);
    }

    public Element get(int index) {
        return this.listOfElements.get(index);
    }
}