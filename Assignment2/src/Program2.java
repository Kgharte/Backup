import java.util.Scanner;
public class Program2
{
    static int powerOfFOurOrNot(int num)
    {

        if(num == 0)
            return 0;
        while(num != 1)
        {
            if(num % 4 != 0)
                return 0;
            num = num / 4;
        }
        return 1;
    }

    // Driver program
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(powerOfFOurOrNot(num) == 1)
            System.out.println(num + " " +
                    " is a power of 4");
        else
            System.out.println(num +
                    "is not a power of 4");
    }
}
