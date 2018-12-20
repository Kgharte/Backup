import java.util.Scanner;
public class Program2
{
    public static void main(String [] args)
    {
        int num;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number");
        num=s.nextInt();
        if(num%2==0){
            if(num>20 && num<30)
                System.out.println("jerry");
        }
        else{
            if(num>20 && num<30)
                System.out.println("Tom");
            else
                System.out.println("Number is not in given range");
        }
    }
}
