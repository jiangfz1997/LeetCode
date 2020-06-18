package Array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while(i < j){
            max = Math.max(max, Math.min(height[i], height[j])*(j-i));
            if(height[i] > height[j]) j--;
            else i++;
        }
        return max;
    }
}
