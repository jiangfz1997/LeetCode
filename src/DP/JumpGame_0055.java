package DP;

public class JumpGame_0055 {
/*Bottom Up*/
    public boolean canJump(int[] nums) {
        int[] mem = new int[nums.length];
        mem[nums.length-1] = 1;
        for(int i = nums.length-2; i >=0; i--){
            int farJump = Math.min(nums.length-1, i + nums[i]);
            for(int j = i; j <= farJump; j++){
                if(mem[j] == 1){
                    mem[i] = 1;
                    break;
                }
            }
        }
        return mem[0] == 1;
    }

    /*Greedy*/
    public boolean canJump_Greedy(int[] nums) {
        int last = nums.length - 1;
        for(int i = nums.length - 2; i >=0; i--){
            if(i + nums[i] >= last) last = i;
        }

        return last == 0;
    }
}
