/*enter the first no1
 * enter second no2
 * enter operation[+,-,*,/,^]:-
 * no1-no2=?
 * java.util.Scanner
 * main()//driver method
 * Calculator(op1,op2,operator)
 */
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter first no:  ");
      int no1 =sc.nextInt();
      System.out.print("enter Second no:  ");
      int no2 =sc.nextInt();
      System.out.print("Enter the requried operation[+,-,*,/]: ");
      char operator=sc.next().charAt(0);
      int res=calculate(no1,no2,operator);
      System.out.print("result = "+res);
      sc.close();
    }
      //--Method to perform operations
      static int calculate(int x, int y, char operator )
      {
        int res=0;
        switch(operator)
        {
            case '+':
            res=x+y;
            break;
            case '-':
            res=x-y;
            break;
            case '*':
            res=x*y;
            break;
            case '/':
            res=x/y;
            break;
        }//colsing of switch
      return res;
      }//closing of method

    
}