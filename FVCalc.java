public class FVCalc {
    public static void main(String[] args) {
		int currentValue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        rate = rate/100;
        int years = Integer.parseInt(args[2]); // length in years
        double futureValue = (Math.pow(rate+1, years)*currentValue);
        System.out.println("After "+years+" years, $"+currentValue+" saved at "+(rate*100)+"% will yield $"+(int)(futureValue));
    }
    }