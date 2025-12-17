package conditionstatement;

public class LogicOperator {
    public static void main(String[] args) {
        int a=20,b=10;
        if(a>b && b!=0){
            System.out.println(a+b);
        } else if (b<a || a!=0) {
            System.out.println(a-b);

        }
    }
}
