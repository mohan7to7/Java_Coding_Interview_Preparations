public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] temp= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    temp[0]=i;
                    temp[1]=j;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] result=twoSum(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}
