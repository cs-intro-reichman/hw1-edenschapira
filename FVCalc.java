// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int currentvalue = Integer.parseInt(args[0]);
	double rate = Double.parseDouble(args[1]);//assumed to be in %
	int n = Integer.parseInt(args[2]);//years
	double newrate = rate / 100.0 + 1;
	double futurervalue = currentvalue * Math.pow( newrate , n );
	int newfuturevalue = (int)futurervalue;
	System.out.println("After " +n +" years, $" +currentvalue +
	                    " saved at " +rate +".0% will yield $" +newfuturevalue);

	}
}