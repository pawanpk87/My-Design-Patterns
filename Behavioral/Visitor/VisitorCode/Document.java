package VisitorCode;

import java.util.List;

public class Document implements Element {
    List<Element> elements;

    public Document(List<Element> elements) {
        this.elements = elements;
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
        visitor.visitDocument(this);
    }
}