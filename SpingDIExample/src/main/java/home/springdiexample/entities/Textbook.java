package home.springdiexample.entities;

public class Textbook {

	private int lines;
	private int columns;
	private String name;
	private double secondaryLines;
	
	public Textbook() {
		super();
	}

	public Textbook(int lines) {
		super();
		System.out.println("In constructor - lines : " + lines);
		this.lines = lines;
	}

	/*public Textbook(int lines, int columns) {
		super();
		System.out.println("int lines and int columns");
		this.lines = lines;
		this.columns = columns;
	}*/

	public Textbook(int lines, String name) {
		super();
		System.out.println("int lines and String name");
		this.lines = lines;
		this.name = name;
	}

	public Textbook(int lines, int columns, String name) {
		super();
		this.lines = lines;
		this.columns = columns;
		this.name = name;
	}

	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}

	
	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSecondaryLines() {
		return secondaryLines;
	}

	public void setSecondaryLines(double secondaryLines) {
		this.secondaryLines = secondaryLines;
	}

	@Override
	public String toString() {
		return "Textbook [lines=" + lines + ", columns=" + columns + ", name=" + name + ", secondaryLines="
				+ secondaryLines + "]";
	}
	
}
