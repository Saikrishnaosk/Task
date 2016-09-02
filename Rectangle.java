class Rectangle extends Shape{
public static double Width;
private static double Length;
public  void Colors()
{
System.out.println("Color of Rectangle is:"+ Circle.getColor());
}
public  void Width()
{
Width = y.nextDouble();
}
public static double Width()
{
return Width;
}
public void Length()
{
Length = y.nextDouble();
}
public static double Length()
{
return Length;
}
public void Area()
{
System.out.println("Area of rectangle :" + (Rectangle.Width())*(Rectangle.Length()));
}
public void getPerimeter()
{
	System.out.println("Perimeter of rectangle:"+ (2*((Rectangle.Width())+(Rectangle.Length()))));
}
public static void main(String[] args)
{
	Rectangle r = new Rectangle();
r.Color();
r.Colors();
r.Width();
r.Length();
r.Area();
r.Perimeter();
}
}
