import java.util.*;

public class Conditionalstatment {
    public static void main(String[] args){

                //If else  

    //   try (Scanner sc = new Scanner(System.in)) {
    //     int age = sc.nextInt();

    //       if(age>18){
    //           System.out.println("Your are now adult");
    //       }
    //       else
    //       {
    //           System.out.println("Your are not adult");
    //       }
    // }
                    //IF else &else if

    //     try(Scanner sc = new Scanner(System.in)){
    //         int Num = sc.nextInt();

    //         if(Num%2==0){
    //             System.out.println("Even Number");

    //         }
    //         else if(Num%2!=0){
    //             System.out.println("Odd Number");
    //         }
    //         else{
    //             System.out.println("Not Sure");
    //         }
    //     }
    // }
    
                //Switch Case Statment

        try(Scanner sc = new Scanner(System.in)){

            int button = sc.nextInt();

            switch(button){
                case 1  : System.out.println("hello from case 1");
                break;

                case 2 : System.out.println("hello from case 2");
                break;

                case 3 : System.out.println("hello from case 3");
                break;

                case 4 : System.out.println("hello from case 4");
                break;

                case 5  : System.out.println("hello from case 5");
                break;

                default : System.out.println("Invalid button");
                break;
            }
        }
    }
}
    

