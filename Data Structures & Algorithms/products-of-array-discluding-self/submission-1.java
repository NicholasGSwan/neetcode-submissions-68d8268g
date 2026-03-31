class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] fw = new int[nums.length];
        int[] bw = new int[nums.length];
        for(int i = 0; i < fw.length; i++){
            fw[i] = 1;
            bw[i] = 1;
        }

        for (int i = 1; i < nums.length; i++){
            fw[i] = nums[i-1] * fw[i-1];
        }

        for (int i = nums.length-2; i>-1; i--){
            bw[i] = nums[i+1] * bw[i+1];
        }

        for (int i = 0; i <fw.length; i++){
            fw[i] *= bw[i];
        }
        return fw;
    }
}  
