public class QuadraticEquation
{
public static void main(String[] args) 
{
	System.out.println ("We have to solve an equation  ax2 + bx + c = 0");
	double a = 1;
	double b = 3;
	double c = 1;
	double D = b*b-4*a*c;
if (D == 0)
{
	System.out.println ("We have one root");
	double x = ((-b+Math.sqrt(D))/2*a);
	System.out.println ("x =" + x);
}
else if (D < 0)
{
	System.out.println ("We have no valide roots. Game over");
}
else 
{
	System.out.println ("We have two roots");
	double x1 = ((-b+Math.sqrt(D))/2*a);
	double x2 = ((-b-Math.sqrt(D))/2*a);
	System.out.println ("x1 =" + x1);
	System.out.println ("x2 =" + x2);
}
}
}
