import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        String x = palin(num);
        System.out.println(x);
    }

     static String palin(int num) {
        int copy = num;
        int rev = 0;
        while(num != 0)
        {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        if(copy == rev)
        {
            return "palindrome";
        }
        else{
            return "Not a Palindrome";
        }
    }
}
