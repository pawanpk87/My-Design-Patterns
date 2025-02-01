package VisitorCode;

public class PlainTextVisitor implements Visitor {
    private StringBuilder sb;

    public PlainTextVisitor() {
        sb = new StringBuilder();
    }

    @Override
    public void visitDocument(Document document) {
        // No specific action for Document in plain text
    }

    @Override
    public void visitHeading(Heading heading) {
        sb.append(heading.getText()).append("\n\n");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        sb.append(paragraph.getText()).append("\n");
    }

    public String getPlainText() {
        return sb.toString();
    }
}