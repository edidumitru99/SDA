package Lab3;

public class Dreptunghi implements Shape {

	private String fillColor;
	private int borderWidth;
	private int height;
	private int width;
	
	private HexColorValidator valid = new HexColorValidator();

	public Dreptunghi(String fillColor, int borderWidth, int height, int width) {
		setFillColor(fillColor);
		setBorderWidth(borderWidth);
		setHeight(height);
		setWidth(width);
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height>0)
			this.height = height;
		else
			throw new IllegalArgumentException("Height must be positive");
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width>0)
			this.width = width;
		else 
			throw new IllegalArgumentException("Width must be positive");
	}

	@Override
	public void draw() {
		int i,j;
	
		for(i=0;i<width;i++)
		{
			for(j=0;j<height;j++) {		
				if(i==0 || i== width-1 || j==0 || j== height-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}	
				System.out.println();
		}	

	

	}

	@Override
	public double getArea() {
		
		return width*height;
	}

	@Override
	public String getName() {
		
		return "Rectangle";
	}

	@Override
	public String getHexFillColor() {
		
		return fillColor;
	}

}
