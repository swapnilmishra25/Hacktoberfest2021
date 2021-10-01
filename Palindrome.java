import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rev, ans=0;

        System.out.println("Enter a number");
        int n = in.nextInt();
        int temp;
        temp = n;

        while (n>0)
        {
            rev = n%10;
            n = n/10;
            ans = ans * 10 + rev;
        }

        if(ans == temp){
            System.out.println("The number is a palindrome");
        }
        else {
            System.out.println("The number is not a palindrome");
        }

    }
}
