import java.util.Scanner;
public class Program1
{
    public static void main(String args[])
    {
        long num,orinum,revnum=0,rem,sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        num=s.nextLong();
        orinum=num;
        while (num>0){
            rem = num%10;
            revnum= revnum *10 + rem;
            num=num/10;
            if(rem%2==0){
                sum=sum+rem;
            }
        }
        if(orinum == revnum)
        {
            if (sum>=25)
                System.out.println("Given number "+orinum+" is Palindrome and the sum of even numbers is greater than 25");
            else
                System.out.println("Given number "+orinum+" is Palindrome and the sum of even numbers is less than 25");
        }
        else
        {
            System.out.println("Given number "+orinum+" is Not Palindrome");
        }

    }
}
