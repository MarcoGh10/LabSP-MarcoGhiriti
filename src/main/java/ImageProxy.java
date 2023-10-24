import java.awt.*;

public class ImageProxy {
    String url;
    Dimension dim;
    Image img = null;

    public ImageProxy(Dimension dim) {
        this.dim = dim;
    }

    public ImageProxy(String url) {
        this.url = url;
    }

    public loadImage(Image) {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    @Override
    public String toString() {
        return "ImageProxy{" +
                "url='" + url + '\'' +
                ", dim=" + dim +
                '}';
    }
}
