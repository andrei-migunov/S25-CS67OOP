public class Rectangle {
	private double length;
	private double width;


    //default contructor -- no parameters
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    //another constructor -- it's okay to have more than one
    public Rectangle(double len, double w) {
        length = len;
        width = w;
    }

	//Returns true if the Rectangle is a square
	// Originally conceived by Torsten
	// Non-mutator 
	public boolean isSquare(){
		return (length == width);
	}

	//Square-ify the Rectangle based on the maximum of the length & width
	// Mutator
	public void makeSquareMax(){
		length = width = Math.max(length,width);
	}

	//Square-ify the Rectangle based on the minimum of the length & width
	public void makeSquareMin(){
		length = width = Math.min(length,width);
	}

	public void setLength(double len) {
		length = len;
	}

    public double getLength() {
		return length;
	}
		
	public void setWidth(double w) {
		width = w;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length * width;
	}

}
