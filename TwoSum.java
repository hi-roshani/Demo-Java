public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 1;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(nums[j] + nums[j-i] == target){
                    return new int[] {j,j-i};
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res[0]+"  "+res[1]);
    }
}
