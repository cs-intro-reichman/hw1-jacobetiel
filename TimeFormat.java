public class TimeFormat {
    public static void main(String[] args) {
        String time = args[0];
        
        String hours = time.substring(0,2);
        String minutes = time.substring (3);
       // System.out.println("the time is "+ time+ " hours is " + hours + " minutes is " + minutes);
        int num1 = Integer.parseInt(hours);
        int num2 = Integer.parseInt(minutes);
       // System.out.println("num1 is: "+num1+" num2 is "+num2);
        boolean ampm = true;
        if ( num1 == 12)
            ampm = false;
        if (num1 == 00)  {
            num1 = 12;
        }
         if(num1<10)
        {
            System.out.print("0");
        }
        
        
        if (num1 > 12)
            {   
            ampm = false;
            num1 = num1 -12;
            if(num1<10)
                System.out.print("0");
            }
        System.out.print(num1+":");
        if(num2<10)
            System.out.print("0"+num2);
        else    
            System.out.print(num2);
        //System.out.println(num1+":"+num2);
            
        if (ampm)
            System.out.print(" AM");
        if (ampm == false)
            System.out.print(" PM");
    }
    }