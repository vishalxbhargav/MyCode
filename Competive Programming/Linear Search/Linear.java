public class Linear {
    public static void main(String[] args) {
        int[] nums ={23,45,3,485,66,6,7,8,9,10,1};
        int target = 66;
        int ans = LinearSearch(nums,target);
        System.out.println(ans);
        System.out.println(LinearSearch2(nums, target));
    }

    static int LinearSearch(int[] arr, int target){
        
        if(arr.length == 0){
            return -1;
        }

    
        //check index number with target
        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target ){
                return index;
            }
        }

        //this will execute when none of the 
        return -1;
    }

    //this function return the element itself
    static int LinearSearch2(int[] arr, int target){
        
        if(arr.length == 0){
            return -1;
        }

    
        //check index number with target
        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target ){
                return element;
            }
        }

        //this will execute when none of the 
        return -1;
    }
}
