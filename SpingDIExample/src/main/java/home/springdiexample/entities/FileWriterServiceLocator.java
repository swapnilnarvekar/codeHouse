package home.springdiexample.entities;

public class FileWriterServiceLocator {

	
	public FileWriterService getPdfFileWriterService(){
		return new PdfFileWriterService();
	}
	
	public FileWriterService getXmlFileWriterService(){
		return new XmlFileWriterService();
	}
}
