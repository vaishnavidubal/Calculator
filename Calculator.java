import java.lang.*;
import java.util.*;

public class Calculator 
{
    public static void main(String[] args)
    {
        int N1 = 0, N2 = 0, Res = 0, Choice = 0;
        Scanner S = new Scanner(System.in);

        while(true)
        {
            System.out.print("\n=====================***********===========================\n");

            System.out.print("\n *******Calculator*******\n");
            System.out.print("\n Choices : ");
            System.out.print("\n\t 1. Addition");
            System.out.print("\n\t 1. Subtraction");
            System.out.print("\n\t 1. Multiplication");
            System.out.print("\n\t 1. Division");
            System.out.print("\n\t 1. Remainder");
            System.out.print("\n\t 1. Exit");

            System.out.print("\n=====================***********===========================\n");
            
            System.out.print("\n Select your choice : ");
            Choice = S.nextInt();

            if((Choice > 0) && (Choice < 6))
            {
                System.out.print("\n Enter 1st Number : ");
                N1 = S.nextInt();
                System.out.print("\n Enter 2nd Number : ");
                N2 = S.nextInt();
            }

            switch(Choice)
            {
                case 1:
                       /// Add
                       Res = N1 + N2;
                       System.out.println("\n Addition of " + N1 + " & " + N2 + " is = " + Res + ".");
                       S.nextInt();
                       break;
                case 2:
                       /// sub
                       Res = N1 + N2;
                       System.out.println("\n Subtraction of " + N1 + " & " + N2 + " is = " + Res + ".");
                       S.nextInt();
                       break;
                case 3:
                       /// Mul
                       Res = N1 + N2;
                       System.out.println("\n Multiplication of " + N1 + " & " + N2 + " is = " + Res + ".");
                       S.nextInt();
                       break;
                case 4:
                       /// Div
                       Res = N1 + N2;
                       System.out.println("\n Division of " + N1 + " & " + N2 + " is = " + Res + ".");
                       S.nextInt();
                       break;
                case 5:
                       /// Rem
                       Res = N1 + N2;
                       System.out.println("\n Remainder of " + N1 + " & " + N2 + " is = " + Res + ".");
                       S.nextInt();
                       break;
                case 6:
                       break;
                default:
                     ///Invalid
                     System.out.println("\n Invalid Input!!!");
         }
         if(Choice == 6)
         {
            break;
         }
        }
        System.out.print("\n Thanks For Using this calculator service.........\n");
    }
    
}
