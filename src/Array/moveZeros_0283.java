package Array;

public class moveZeros_0283 {

    public void moveZero(int nums[]){
        int i = 0;

        for( int j = 0; j < nums.length;){
            while(nums[i]!=0 && i < nums.length-1){
                i++;
            }
            if(i == nums.length-1) return;
            while((nums[j] == 0 || j <= i) && j < nums.length-1){
                j++;
            }
            int tmp = nums[i];
            nums[i++] = nums[j];
            nums[j++] = tmp;

        }
    }

    public static void main(String args[]){
        moveZeros_0283 m = new moveZeros_0283();
        int[] num = {1,2,0,3,4,0,5};
        m.moveZero(num);

       for(int i : num){
           System.out.println(i);
       }
    }
}
