


public class Square {

	private int x,y;
	private double sideLength;
	private String shape_Square = "[]";
	
	public Square() {}
	
	public Square(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	public Square(int newX, int newY, double newSideLength) {
		x = newX;
		y = newY;
		sideLength = newSideLength;
	}

	public void draw() {
		System.out.println(shape_Square);
	}
	
	
	public int getX() {return x;}

	public int getY() {return y;}

	public double getSideLength() {return sideLength;}
	
	public double getArea() {return sideLength * sideLength;}

	public void setX(int x) {this.x = x;}

	public void setY(int y) {this.y = y;}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	
	
	public boolean isEqual(Square sq_Object) {
		
		if(this.getArea() == sq_Object.getArea() && this.sideLength == sq_Object.sideLength) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "[]";
	}
}