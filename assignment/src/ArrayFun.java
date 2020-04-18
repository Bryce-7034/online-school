
public class ArrayFun {
    int[] nums;
    int[] mixedNums;

    public ArrayFun(int[] nums){
        this.nums = nums;
        //his.mixedNums = nums;
        arrayMixup();
    }

    public void arrayMixup(){
        mixedNums = new int[nums.length];
        mixedNums[0] = nums[nums.length-1];
        mixedNums[mixedNums.length-1] = nums[0];
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i]%nums[i-1]==0){
                mixedNums[i] = (nums[i]/nums[i-1])*nums[i+1];
            }
            else if(nums[i]>nums[i+1]){
                mixedNums[i] = nums[i]/nums[i+1];
            }
            else{
                mixedNums[i] = nums[i];
            }
        }
    }

    public int greatestDiff(){
        int max = mixedNums[0];
        int min = mixedNums[0];
        for (int num:mixedNums) {
            if (num > max){
                max = num;
            }
            else if (num < min){
                min = num;
            }
        }
        return max - min;
    }

    public int[] getNums(){
        return nums;
    }
    public int[] getMixedNums() {
        return mixedNums;
    }
    public void setMixedNums(int[] mixedNums) {
        this.mixedNums = mixedNums;
    }
    public void setNums(int[] nums) {
        this.nums = nums;
    }
}
