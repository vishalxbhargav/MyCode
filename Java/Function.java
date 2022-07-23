import java.util.Scanner;

public class Function {
    //Function Declearation
    public static void MyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            //Function call
            MyName(name);
        }
    }
    
}
