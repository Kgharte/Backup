import java.util.Scanner;

public class EvenNumTest
{
    public static boolean isEven(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        return false;

    }
    public static void  main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number : ");
        int num = sc.nextInt();
        isEven(num);

        boolean answer=isEven(num);
        if (answer==true)
        {
            System.out.println("TRUE");
        }

        else
        {
            System.out.println("FALSE");
        }
    }


}
