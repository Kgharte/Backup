import java.util.Scanner;
public class Program1
{
    public void Palindrom()
    {
        int num, orgnum, revnum = 0,rem;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = s.nextInt();
        orgnum = num;
        while(num > 0)
        {
            rem = num % 10;
            revnum = revnum * 10 + rem;
            num = num / 10;
        }
        if(revnum == orgnum)
        {
            System.out.println("Given number "+orgnum+" is Palindrome");
        }
        else
        {
            System.out.println("Given number "+orgnum+" is Not Palindrome");
        }
    }
    public static void main(String args[])
    {
        Program1 p1 = new Program1();
        p1.Palindrom();
    }
}
