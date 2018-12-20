import java.util.Scanner;
public class Program10
{
    public static void main(String [] args){
        String s;
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.next();
        char arr[] = s.toCharArray();
        System.out.println("enter the number : ");
        num=sc.nextInt();
        int len=s.length();
        int size=num*num;
        char str[]=new char[size];
        int k=0;
        for(int i=0;i<num;i++){
            for(int j=len-num;j<len;j++){
                str[k++]=arr[j];
            }
        }
        String newString;
        newString = String.valueOf(str);
        String final_string=s.concat(newString);
        System.out.println(final_string);
    }
}
