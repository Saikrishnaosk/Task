import java.lang.Math;
class Circle extends Shape{
private static double radius;
private final double pI = 3.142;
public  void Colors()
{
System.out.println("Color of circle is:"+ Circle.Color());
}
public  void Radius()
{
	radius = y.nextDouble();
}
private static double Radius(){
	return radius;
} 
public void Area()
{
	System.out.println("Area of circle " + (pI)*Math.pow(Circle.Radius(),2));
}
public void Perimeter()
{
	System.out.println("Perimeter of circle "+ (pI)*2*(Circle.Radius()));
}
public static void main(String[] args)
{
Circle c = new Circle();
c.Color();
c.Colors();
c.Radius();
c.Area();
c.Perimeter();
}
}
