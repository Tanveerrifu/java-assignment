package ifelse_loop;

//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241

import java.util.Scanner;
public class Check_Decimal_Number {


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        double x = in.nextDouble();
        System.out.println("Input seconf number: ");
        double y = in.nextDouble();

        x = Math.round(x * 100);
        x = x / 100;

        y = Math.round(y * 100);
        y = y / 100;

        if (x == y)
        {
            System.out.println("They are the same up to two decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
