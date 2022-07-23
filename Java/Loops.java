public class Loops {
    public static void main(String[] args){
        //There are three types of Loops in Java
        //for Loop
        for(int i=1; i<11; i++){
            System.out.println(i);
        }

        //While Loop
        System.out.println("Table of 2");
        int j=2;
        while(j<=20){
            System.out.println(j);
            j=j+2;
        }

        //Do while Loop
        System.out.println("Table of 3");
        int k=3;
        do{
            System.out.println(k);
            k=k+3;
        }
        while(k<=30);
        
        
    }
    
}
