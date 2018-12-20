import java.util.Scanner;
public class Program4
{
    public static void main(String [] args){
        int num;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number of iteration :");
        num=s.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+i);
            }
        }
    }
}
