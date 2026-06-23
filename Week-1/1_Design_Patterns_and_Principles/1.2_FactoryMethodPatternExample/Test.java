public class Test {
    public static void main(String[] args) {
      DocumentFactory factory1=new WordDocumentFactory();
      Document doc1=factory1.createDocument();
       doc1.open();
        DocumentFactory factory2=new PdfDocumentFactory();
        Document doc2=factory2.createDocument();
        doc2.open();
        DocumentFactory factory3=new ExcelDocumentFactory();
        Document doc3=factory3.createDocument();
        doc3.open();

    }
}
