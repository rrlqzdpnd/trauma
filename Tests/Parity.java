import java.io.*;
import java.util.*;

public class Parity	{
	
	
	public static void main(String[] args) throws Exception	{
		int i = 0;
		while(i < 10)	{
			if(i % 2 == 0)
				System.out.print("Even\n");
			else
				System.out.print("Odd\n");
			i = i + 1;
		}
	}

}