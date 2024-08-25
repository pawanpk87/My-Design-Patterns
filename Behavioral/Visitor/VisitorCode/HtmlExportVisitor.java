package VisitorCode;

public class HtmlExportVisitor implements Visitor {
    private StringBuilder html;

    public HtmlExportVisitor() {
        this.html = new StringBuilder();
    }

    @Override
    public void visitDocument(Document document) {
        html.append("<html><body>\n");
        // Process child elements
        html.append("</body></html>\n");
    }

    @Override
    public void visitHeading(Heading heading) {
        html.append("<h2>").append(heading.getText()).append("</h2>\n");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        html.append("<p>").append(paragraph.getText()).append("</p>\n");
    }

    public String getHtml() {
        return html.toString();
    }
}