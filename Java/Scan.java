import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Value =");
            int a = sc.nextInt();
            System.out.println("Enter Value =");
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println(sum);
        }
    }
    
}
