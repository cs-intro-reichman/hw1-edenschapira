// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	int lim = Integer.parseInt(args[0]);
	int a = (int)(Math.random() * lim);
	int b = (int)(Math.random() * lim);
	int c = (int)(Math.random() * lim);
	int max = (int)Math.max(a, b);
	max = (int)Math.max(max, c);
	int min = (int)Math.min(a, b);
	min = (int)Math.min(min, c);
	int mid = (a+b+c)-min-max;
	System.out.println(a+" "+b+" "+c);
	System.out.println(min+" "+mid+" "+max);


	}
}
