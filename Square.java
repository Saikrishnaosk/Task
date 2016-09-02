class Square extends Rectangle{
private static double size;
public  void Colors()
{
System.out.println("Color of Square is:"+ Circle.Color());
}
public  void Size()
{
size = y.nextDouble();
}
public static double Size()
{
return size;
}
public static void AreaS()
{
System.out.println("Area of Square :" + Math.pow((Square.Size()),2));
}
public static void PerimeterS()
{
System.out.println("Perimeter of square:" + (4*Square.Size()));
}
public static void main(String[] args)
{
Square s = new Square();
s.Color();
s.Colors();
s.Size();
s.AreaS();
s.PerimeterS();
}
}
