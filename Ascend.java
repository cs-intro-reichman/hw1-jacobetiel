public class Ascend {
    public static void main(String[] args) {
		int a,b,c;
        int lim = Integer.parseInt(args[0]);
        a = (int)(Math.random() * lim); 
        b = (int)(Math.random() * lim);
        c = (int)(Math.random() * lim);
        int t1 =  Math.min(a,b); // temporarry integer to find smallest number out of first 2 and compare with last.
        int f1 =  Math.min(t1,c); // checks whether one of the first integers is smaller than the last
        int t2 = Math.max(a,b); // checks who is bigger a or b so we can comapre it to c
        int f2 = Math.max(t2,c); // checks if either a/b is bigger tha nc
        int t3 = Math.min(a,b);
        int t4 = Math.min(b,c);
        int f3 = Math.max(t3,t4);
        System.out.println(f1+" "+f3+" "+f2);
    }
    }