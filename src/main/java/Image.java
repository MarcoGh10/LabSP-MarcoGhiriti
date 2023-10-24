public class Image {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    private void print() {

    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageName='" + imageName + '\'' +
                '}';
    }
}