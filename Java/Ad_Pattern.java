public class Ad_Pattern {
    public static void main(String[] args){


        //The Butterfly Pattern
        int n=4;  
        //Upper

        for( int i=1; i<=n; i++){
            //1st
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower 
        for( int i=n; i>=1; i--){
            //1st
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            //spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Solid Rhombus
        System.out.println("Solid Rhombus");
        int m=5;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Number Pyramid
        System.out.println("Number Pyramid");
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        
    }
    
}
