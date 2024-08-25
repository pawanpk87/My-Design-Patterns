package VisitorCode;

public interface Visitor {
    void visitDocument(Document document);

    void visitHeading(Heading heading);

    void visitParagraph(Paragraph paragraph);
}