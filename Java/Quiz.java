import java.util.*;

public class Quiz {
    public static void main(String[] args){
        // int a=10,b=5;

        // int ans = a*b/a-b;
        // System.out.println(ans);

        // try (//input
        // Scanner sc = new Scanner(System.in)) {
        //     String name = sc.nextLine();
            
        //     System.out.println(name);
        // }



        
        //Question:- print the sum of n Natural Number,where n=4

        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int sum=0;
            for (int i=0; i<=n; i++){
                sum=sum+i;
                
            }
            System.out.println(sum);
        }
    }
}
