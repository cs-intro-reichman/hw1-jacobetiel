public class NumWords {
    public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
        int hundreds = num/100;
        int singles = num%10;
        num = num/10;
        int tens = num%10;
        System.out.println(hundreds+" hundreds, "+tens+" tens, and "+singles+" ones.");
       
    }
    }