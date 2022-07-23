import java.util.ArrayList;

class ArryList{
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);

        //get element
        int element = list.get(2);
        System.out.println(element);
        list.add(8,8);

        System.out.println(list);
    }
}