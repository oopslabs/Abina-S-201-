package co3;
import java.util.*;
interface areaperimeter{
	final float pi=3.14f;
	void area(float x,float y);
	void perimeter(float a, float b);
}
class circle implements areaperimeter
{
	public void area(float x,float y)
	{
		System.out.println("Area of circle: "+2*pi*x*x);
	}
	public void perimeter(float a,float b)
	{
		System.out.println("Perimeter of circle: "+2*pi*a);
	}
}
class rectangle implements areaperimeter
{
	public void area(float x,float y)
	{
		System.out.println("Area of Rectangle: "+x*y);
	}
	public void perimeter(float a,float b)
	{
		System.out.println("Perimeter of Rectangle: "+2*(a+b));
	}
}
public class area_perimeter {
public static void main(String args[]){
	areaperimeter arpr;
	circle cir=new circle();
	arpr=cir;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter radius of circle: ");
	float r=s.nextFloat();
	arpr.area(r,r);
	arpr.perimeter(r, r);
	
	rectangle rect=new rectangle();
	arpr=rect;
	System.out.println("Enter length of rectangle: ");
	float a=s.nextFloat();
	System.out.println("Enter breadth of rectangle: ");
	float b=s.nextFloat();
	arpr.area(a,b);
	arpr.perimeter(a, b);
}
}

