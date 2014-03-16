import java.io.*;
import java.util.*;

public class Factorial	{
	
	
	static int factorial(int x)	{
		if(x == 0)
			return 1;
		return x * factorial(x - 1);
	}
	
	public static void main(String[] args) throws Exception	{
		int a = factorial(5);
		System.out.print(a);
	
	}

}