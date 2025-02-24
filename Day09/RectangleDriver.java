public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); //default constructor
        Rectangle r2 = new Rectangle(3.0, 4.0);
          
        System.out.println("The area of r1 is: " + r1.getArea());
        System.out.println("The area of r2 is: " + r2.getArea());
          
        r1.setLength(20);
        r1.setWidth(12);
          
        System.out.println("The NEW area of r1 is: " + r1.getArea());

        Rectangle r3 = new Rectangle(5.5,12.0);
        System.out.println("A rectangle with " + r3.getLength() + " length and " + r3.getWidth() + 
         " width has area " + r3.getArea());

        Rectangle r4 = new Rectangle(10,10);
        System.out.println(r4.isSquare());
        System.out.println(r3.isSquare());
    }
}
