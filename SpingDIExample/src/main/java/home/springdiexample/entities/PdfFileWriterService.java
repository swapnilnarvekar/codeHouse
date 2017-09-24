package home.springdiexample.entities;

public class PdfFileWriterService implements FileWriterService{

	@Override
	public void writeFile() {
		System.out.println("PDF File ");
	}

}
