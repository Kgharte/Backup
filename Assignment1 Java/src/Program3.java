import java.util.Scanner;
public class Program3
{
    public static void main(String arg[]){
        String result="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str=sc.next();
        char []vowel={'a','e','i','o','u','A','E','I','O','U'};
        int j=0;
        for(int i=0; i<str.length() ; i++){
            j=0;
            if((str.charAt(i)>=65 && str.charAt(i)<=90)|| (str.charAt(i)>=97 && str.charAt(i)<=122)) {
                while(j<10){
                    if (str.charAt(i) == vowel[j]) {
                        result="Vowel";

                        break;
                    }else if(j<10) {
                        j++;
                        result="Consonant";

                    }
                    else {
                        result="Consonant";

                        break;
                    }
                }
                System.out.print(result+" ");
            }
            else{
                System.out.print(str+" is not a valid word");
                break;
            }

        }
    }
}
