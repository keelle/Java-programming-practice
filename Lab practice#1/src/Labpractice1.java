import java.util.Scanner;

public class Labpractice1 {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	int i = scn.nextInt();
	String a = Integer.toBinaryString(i);
	String b = Integer.toOctalString(i);
	String c = Integer.toHexString(i);

	System.out.print("b ");
	System.out.println(a);
	System.out.print("o ");
	System.out.println(b);
	System.out.print("h ");
	System.out.println(c);
}
}