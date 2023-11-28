package models;

import javax.lang.model.element.*;
import javax.lang.model.util.Elements;
import java.io.Writer;
import java.util.List;
import java.util.Map;

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
    public void add(javax.swing.text.html.parser.Element element) {

    }

    @Override
    public void remove(javax.swing.text.html.parser.Element element) {

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

    @Override
    public javax.swing.text.html.parser.Element get(int index) {
        return null;
    }

    @Override
    public PackageElement getPackageElement(CharSequence name) {
        return null;
    }

    @Override
    public TypeElement getTypeElement(CharSequence name) {
        return null;
    }

    @Override
    public Map<? extends ExecutableElement, ? extends AnnotationValue> getElementValuesWithDefaults(AnnotationMirror a) {
        return null;
    }

    @Override
    public String getDocComment(Element e) {
        return null;
    }

    @Override
    public boolean isDeprecated(Element e) {
        return false;
    }

    @Override
    public Name getBinaryName(TypeElement type) {
        return null;
    }

    @Override
    public PackageElement getPackageOf(Element e) {
        return null;
    }

    @Override
    public List<? extends Element> getAllMembers(TypeElement type) {
        return null;
    }

    @Override
    public List<? extends AnnotationMirror> getAllAnnotationMirrors(Element e) {
        return null;
    }

    @Override
    public boolean hides(Element hider, Element hidden) {
        return false;
    }

    @Override
    public boolean overrides(ExecutableElement overrider, ExecutableElement overridden, TypeElement type) {
        return false;
    }

    @Override
    public String getConstantExpression(Object value) {
        return null;
    }

    @Override
    public void printElements(Writer w, Element... elements) {

    }

    @Override
    public Name getName(CharSequence cs) {
        return null;
    }

    @Override
    public boolean isFunctionalInterface(TypeElement type) {
        return false;
    }
}