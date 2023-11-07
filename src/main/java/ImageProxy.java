import javax.lang.model.util.Elements;

public class ImageProxy implements Elements, Picture {
    private final String url;
    private Image image;



    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public String url() {
        String copyUrl = this.url;
        return copyUrl;
    }

    @Override
    public void add(Elements element) {

    }

    public Image loadImage() {
        if (this.image == null) {
            this.image = new Image(this.url);
        }
        return this.image;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void remove(Elements element) {

    }
}