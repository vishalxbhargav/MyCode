

import java.util.Scanner;

public class Arry {
    public static void main(String[] args){
        int[] mark =new int[4];
        mark[0]=30;
        mark[1]=40;
        mark[2]=55;
        mark[3]=4;
        for(int i=0; i<=3; i++){
            System.out.println(mark[i]);
        }
        System.out.println("////");

        int number[]={99,76,56,77,89};
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number You Wann search");
            int cout =sc.nextInt();
            for(int i=0; i<=number.length; i++){
                if( number[i]==cout){
                    System.out.println("The Number found on Posision "+i);
                    
                }
            }
        }
    }
}
