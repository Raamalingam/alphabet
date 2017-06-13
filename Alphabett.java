import java.io.*;
import java.util.*;
class Alphabett{
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char a[]=s1.toCharArray();
		int b=a[0];
		if((b>64||b>96)&&(b<91||b<123))
		{
		    System.out.println("Alphabet");
		}
		else
		{
		    System.out.println("not");
		}
	}
}
