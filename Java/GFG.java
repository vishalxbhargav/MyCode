public class GFG {
    /*  1.Problem frome geek for geek :-
        Print 1 To N Without Loop 
    */
    static void pritnNos(int N){
        if(N>0){
            pritnNos(N-1);
            System.out.print(N+" ");
        }
        return;
    }
    public static void main(String[] args){
        pritnNos(20);
    }
    
}
