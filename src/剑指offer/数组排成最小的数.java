package 剑指offer;
/*
* 选用排序，当两个数拼在一起时有两种拼法，优先选择结果小的那一种
* */
public class 数组排成最小的数 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0 || numbers == null) return "";
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                int sum1 = Integer.parseInt(numbers[i] + "" + numbers[j]);
                int sum2 = Integer.parseInt(numbers[j] + "" + numbers[i]);
                if(sum1 > sum2){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }

        }
        String result = "";
        for(int n : numbers){
            result += n;
        }
        return result;
    }
}
