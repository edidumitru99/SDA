package Lab3;

public class Cerc implements Shape{

	
	private String fillColor;
	private int borderWidth;
	private int radius;
	
	private HexColorValidator valid = new HexColorValidator();
	
	public Cerc(String fillColor, int borderWidth  , int radius) {
		setFillColor(fillColor);
		setBorderWidth(borderWidth);
		setRadius(radius);
	}


	public String getFillColor() {
		if(valid.validate(fillColor))
			return fillColor;
		else
			throw new IllegalArgumentException("Invalid hex");
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


	public int getBorderWidth() {
		return borderWidth;
	}


	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		if(radius>0)
			this.radius = radius;
		else 
			throw new IllegalArgumentException("Radius must be positive");
	}
	
	public void draw() {
		double dist;
		
		for(int i=0; i<=2*radius;i++)
		{
			for(int j=0;j<=2*radius;j++)
			{
				dist = Math.sqrt(Math.pow(i-radius, 2)+Math.pow(j-radius, 2));
				if(dist > radius - 0.5 && dist < radius+0.5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String getName() {
		
		return "Circle";
	}
	public String getHexFillColor() {
		return fillColor;
		
	}
	
}
