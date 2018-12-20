package com.stackroute.unittest.pe1;

public class PalindromeCheck
{
    public String palindromOrNot(long num) {
        long orinum, revnum = 0, rem, sum = 0;

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
                return "Given number is Palindrome and the sum of even numbers is greater than 25";
            else
                return "Given number is Palindrome and the sum of even numbers is less than 25";
        }
        else
        {
            return "Given number  is Not Palindrome";
        }
    }
}
