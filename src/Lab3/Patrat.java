package Lab3;

public class Patrat implements Shape{

	private String fillColor;
	private int borderWidth;
	private int size;
	
	private HexColorValidator valid = new HexColorValidator();
	
	public Patrat(String fillColor , int borderWidth , int size)
	{
		setBorderWidth(borderWidth);
		setFillColor(fillColor);
		setSize(size);
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		if(valid.validate(fillColor))
			this.fillColor = fillColor;
		else
			throw new IllegalArgumentException("Invalid hex");
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size>0)
			this.size = size;
		else
		  throw new IllegalArgumentException("Size must be positive");
	}
	
	
	public void draw()
	{
		int i,j;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++) {	 
				if(i==0 || i== size-1 || j==0 || j== size-1)
					System.out.print("* ");
				else
					System.out.print("  ");

			}	
			System.out.println();
		}
	}
	
	
	public double getArea() {
		return size*size;
	}
	
	public String getName()
	{
		return "Square";
	}
	
	public String getHexFillColor() {
		return fillColor;
	}
	
	
	
	
	
	
}
