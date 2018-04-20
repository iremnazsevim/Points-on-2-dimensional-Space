public class Point {
	private double x;
	private double y;
	private String color;
	
	public Point(double x, double y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public double getX() {
		return x;
	}
	public void setX(double d) {
		this.x = d;
	}
	public double getY() {
		return y;
	}
	public void setY(double d) {
		this.y = d;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setColor(float x) {
		this.x = x;
	}
	public String toString()
	{
		return x + " " + y + " " + color;
		
	}
	
}
