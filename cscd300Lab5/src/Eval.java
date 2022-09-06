import java.util.Stack;

public class Eval {
    public static String convertInfixtoPostFix(String str) {
        LinkedStack stacked = new LinkedStack();
        String postFix = new String("");
        for (int i = 0; i < str.length(); i++) {
            char item = str.charAt(i);
            //while (!str.isEmpty()) {
            if (Character.isLetterOrDigit(item)) {
                postFix = postFix + item;
            } else if (item == '(') {
                stacked.push('(');
            } else if (item == ')') {
                while (!(stacked.top().equals('(')) && !stacked.isEmpty()) {
                    postFix = postFix + stacked.pop();
                }
                stacked.pop();
            } else {
                while (precOnStack(stacked.toString().charAt(1)) >= precCur(item) && !stacked.isEmpty()) {
                    postFix = postFix + stacked.pop();
                }
                stacked.push(item);
            }
            //i++;

        }
        while (!stacked.isEmpty()) {
            postFix = postFix + stacked.pop();
        }
        return postFix;
    }

    public static Object postFixEval(String postFix) {
        LinkedStack stacked = new LinkedStack();
        int i = 0;
        while (i < postFix.length()) {
            String item = String.valueOf(postFix.charAt(i));
            String righHand = "";
            String leftHand = "";
            if (item.equals("0")|| item.equals("1") || item.equals("2") || item.equals("3") || item.equals("4") || item.equals("5")
            || item.equals("6")|| item.equals("7") || item.equals("8") || item.equals("9")) {
                stacked.push(item);
            }
            if(item.equals("+")) {
                Object right = stacked.pop();
                righHand += right;
                Object left = stacked.pop();
                leftHand+= left;
                int value = Integer.parseInt(leftHand) + Integer.parseInt(righHand);
                stacked.push(value);
            }
            if (item.equals("-")) {
                Object right = stacked.pop();
                righHand += right;
                Object left = stacked.pop();
                leftHand+= left;
                int value = Integer.parseInt(leftHand) - Integer.parseInt(righHand);
                stacked.push(value);
            }
            if (item.equals("*")) {
                Object right = stacked.pop();
                righHand += right;
                Object left = stacked.pop();
                leftHand+= left;
                int value = Integer.parseInt(leftHand) * Integer.parseInt(righHand);
                stacked.push(value);
            }
            if (item.equals("/")) {
                Object right = stacked.pop();
                righHand += right;
                Object left = stacked.pop();
                leftHand+= left;
                int value = Integer.parseInt(leftHand) / Integer.parseInt(righHand);
                stacked.push(value);
            }
            if(item.equals("^")) {
                Object right = stacked.pop();
                righHand += right;
                Object left = stacked.pop();
                leftHand+= left;
                int value = (int) Math.pow(Double.parseDouble(leftHand), Double.parseDouble(righHand));
                stacked.push(value);
            }
            i++;
        }
        return stacked.pop();
        }
    public static int precOnStack(char c) {
        switch(c) {
            case '(':
                return 0;
            case '^':
                return 5;
            case '*':
            case '/':
            case '%':
                return 4;
            case '+':
            case '-':
                return 2;
        }
        return -1;
        }

    public static int precCur(char item) {
        switch(item) {
            case '(':
                return 100;
            case ')':
                return 0;
            case '^':
                return 6;
            case '*':
            case '/':
            case '%':
                return 3;
            case '+':
            case '-':
                return 1;
        }
        return -1;
    }
}



