import java.util.Scanner;
import java.lang.Math;

public class Assignment_1_2
{
	public static void main(String[] args)
	{
		double p, f, r, n, denom;
		f = 10000;
		r = .0299;
		n = 10;
		denom = Math.pow(1+r, n);
		p= f/denom;
		//System.out.println(p);
		System.out.printf("$%5.2f%n", p);
	}
}