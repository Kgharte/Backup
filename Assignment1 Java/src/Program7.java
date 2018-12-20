import java.util.Scanner;
public class Program7 {
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        int len=String.valueOf(num).length();
        int sum=0;
        int k=0;
        int arr[]=new int[len];

        while(num > 0){
            arr[k]=num%10;
            if(arr[k]%2==0)
                sum=sum+arr[k];
            k++;
            num=num/10;
        }

        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted number in non-increasing order : ");
        for (int i=0; i <len; i++)
            System.out.print( arr[i]);
        System.out.println(" ");
        System.out.println("Sum of even numbers : " + sum);
        if(sum >15)
            System.out.println("true");
        else
            System.out.println("False");
    }
}