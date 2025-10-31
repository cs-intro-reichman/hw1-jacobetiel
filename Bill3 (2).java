public class Bill3 {
	public static void main(String[] args) {
		String firstName = args[0];
        String secondName = args[1];
        String thirdName = args[2];
        int bill = Integer.parseInt(args[3]);
        System.out.println("Dear " + thirdName + ", " + secondName + ", and " + firstName + ": pay "+(Math.ceil(bill/3.0))+" Shekels each.");
    }
 }