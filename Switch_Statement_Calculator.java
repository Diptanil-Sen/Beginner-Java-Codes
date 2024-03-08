import java.util.*;
public class Calculator {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double a = sc.nextDouble(); 
        double b = sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/,%)");
        char operator = sc.next().charAt(0);
        sc.close();
        double output;
        switch(operator) {
            case '+' : output = a + b;
            System.out.println("Sum of the given two numbers: "+(output));
            break;
            
            case '-' : output = a - b;
            System.out.println("Substraction of the given two numbers: "+(output));
            break;

            case '*' : output = a * b;
            System.out.println("Multiplication of the given two numbers: "+(output));
            break;

            case '/' : if(b == 0) {
                System.out.println("Invalid Division");
            }
            else {
                output = a / b;
            System.out.println("Division of the given two numbers: "+(output));
            }
            break;

            case '%' : if(b == 0) {
                System.out.println("Invalid Division");
            }
            else {
                output = a % b;
            System.out.println("Remainder/Modulo of the given two numbers: "+(output));
            }
            break;

            default:
            System.out.println("Invalid Operator");
        }
    }
}
