import java.util.Scanner;
//--------------------------------four operations calculator
public class Calculator {
    public static void main(String[] args) {
        char operation;
        int x;
        int y;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter one of these mathematical operations: + - * / " );
        operation = input.next().charAt(0);

        System.out.println("Please enter the first number: ");
        x = input.nextInt();

        System.out.println("Please enter the second number: ");
        y = input.nextInt();

        int result;

        switch(operation){
            case '+':
                result = x + y;
                break;

            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;

            case '/':
                if(y==0){
                    System.out.println("division by 0 is not allowed");
                    return;  //stop the program
                }else {
                    result = x / y;
                }
                break;

            default:
                    System.out.println("Invalid operation");
                    return; //stop the program
        }

        System.out.println("the result is : " + result);
    }
}
