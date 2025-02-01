package VisitorCode;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new Heading("Document Title"));
        elements.add(new Paragraph("This is some content in a paragraph."));

        Document document = new Document(elements);

        HtmlExportVisitor htmlExportVisitor = new HtmlExportVisitor();
        document.accept(htmlExportVisitor);
        System.out.println(htmlExportVisitor.getHtml());

        PlainTextVisitor plainTextVisitor = new PlainTextVisitor();
        document.accept(plainTextVisitor);
        System.out.println(plainTextVisitor.getPlainText());
    }
}
