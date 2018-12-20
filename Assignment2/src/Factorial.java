
public class Factorial
{
    public static void main(String[] args)
    {
        Factorial fact = new Factorial();

        System.out.println("Int factorials:");
        fact.printIntFactorials();

        System.out.println("Long factorials:");
        fact.printLongFactorials();
    }

    private void printIntFactorials()
    {
        int i  = 1;
        int fn = 1;
        while (true)
        {
            System.out.println("The factorial of " + i + " " + "is" + " "+ fn);
            if (Integer.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of" + i + " " + " is out of range.");
                break;
            }
            i++;
            fn = fn *i;
        }

    }

    private void printLongFactorials()
    {
        long i  = 1L;
        long fn = 1L;
        while (true)
        {
            System.out.println("The factorial of " + i + " " + "is" + " "+ fn);
            if (Long.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of" + i + " " + " is out of range.");
                break;
            }
            i++;
            fn = fn *i;
        }

    }
}
