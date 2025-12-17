package conditionstatement;

public class ConditionStmt {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String operator = "+";
        if (operator.equals("-")) {
            System.out.println(a - b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println(a / b);
        } else if (operator.equals("+")) {
            if(a>b) {
                System.out.println(a + b);
            }
            else{
                System.out.println(b-a);
            }
        } else {
            System.out.println("Enter the valid operator");
        }
    }
}