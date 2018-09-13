/*Bharavi Misra P6
	 * Display name
	 * Calculate area of rectangle
	 * Calculate area and circumference of circle
	 */
public class FirstHomework 
{
	 public static void main (String[] args) 
	 {
		 String name = "Mr.Ellis";
		 double side1 = 3;
		 double side2 = 4;
		 double circleRadius = 3;
		 double area = 0;
		 double circumference = 0;
		 double circArea = 0;
		 double pi = 3.14;
		 
		 //Display name
		 System.out.println("Name: "+ name);
		 
		 //Area of Rectangle
		 area = side1*side2;
		 System.out.println("Rectangle area: "+ area);
		 
		 //Circumference
		 circumference= pi*circleRadius*2;
		 System.out.println("Circumference: " + circumference);
		 
		 //Circle area
		 circArea= pi*circleRadius*circleRadius;
		 System.out.println("Circle area: " +circArea);
	 }
}
