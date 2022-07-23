public class leetecode {
    private static final char[] True = null;

    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<=nums.length; i++){
            for(int j=0;i<=nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.print(True);
                }
                
            }
        }
        return false;
    }
    
}
