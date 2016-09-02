import java.util.Scanner;
abstract class Shape{
public static String color;
public boolean filled;
Scanner y = new Scanner(System.in);
public abstract void Area();
//public abstract void Perimeter();
public  void setColor()
{
color =y.nextLine();
}
public static String Color()
{
return color;
}
public boolean isFilled()
{
return filled;
}

public void Filled(boolean filled)
{
filled = true;
}
}

