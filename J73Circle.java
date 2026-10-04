import java.util.*;
class Circle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a radius : ");
		double radius = sc.nextDouble();
  final double PI = 22/7.0;
        double area = 2 * radius * radius;
        double perimeter = 2 * PI * radius;

        System.out.println("Radius of Circle is " + radius + "cm");
        System.out.println("Area of the Circle is " + area + "cm^2");
        System.out.println("Perimeter of the Circle is " + perimeter + "cm");


	}
}