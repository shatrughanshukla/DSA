import java.util.Scanner;
public class CaseCheckandChange {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        try{
            char ch = sc.next().charAt(0);
            if(Character.isUpperCase(ch)){
                System.out.println(Character.toLowerCase(ch));
            }
            else{
                System.out.println(Character.toUpperCase(ch));
            }
        }finally{
            sc.close();
        }
    }
}
