package patterns;

public class ReverseString {
    public static void main(String[] args) {
        String a="lmti";
        String newName="";
        for(int i=a.length()-1; i>=0; i--){
            //System.out.println(a.charAt(i));
            newName += a.charAt(i);
        }
        System.out.println(newName);
    }
}
