package conditionstatement;

public class College {
    public static void main(String[] args) {
        int professor=500, AssistantProfessor=300, TrainingStaff=150;
        int WDp1=10,WDp2=5,WDp3=15;
        int totalWD=30;
        if(WDp1<=totalWD && professor==500){
            System.out.println(professor*WDp1);
        } else if (WDp1<=totalWD && AssistantProfessor==300) {
            System.out.println(professor*WDp2);
        }
        else if(WDp1<=totalWD && TrainingStaff==300){
            System.out.println(professor*WDp3);
        }
    }
}
/* if(role==prof && sal>=500)
        {
            sal*10
        }
else if role == assis && sal<=300
            sal*5 */