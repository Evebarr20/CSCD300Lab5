import java.util.Scanner;
public class Tester {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the infix expression to process: ");
        String infix = input.nextLine();
        String postFix = Eval.convertInfixtoPostFix(infix);
        System.out.println("The postfix expression for the input infix is: " + Eval.convertInfixtoPostFix(infix));
        System.out.println("The final result after evaluating the postfix is: " + Eval.postFixEval(postFix));

    }
}
