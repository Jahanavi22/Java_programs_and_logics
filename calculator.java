import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        double num1 , num2 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+ , - , * , or /) : ");
        char op = sc.next().charAt(0);
        double output = 0;
        switch (op) {
            case '+':
            output = num1+num2;
                break;
            
            case '-':
            output = num1-num2;
            break;

            case '*':
            output = num1*num2;
                break;

            case '/':
            output = num1/num2;
                break;
            default:
                System.out.println("wrong input");;
        }

        System.out.println("Result is :");
        System.out.println(num1 + " "+op+ " "+num2+" "+"= "+output);
    }
}