package String;

public class BulbSwitch_1529 {
    public int minFlips(String target) {
        int pivot = 0;
        int sum = 0;
        for(int i = 0; i < target.length(); i++){
            if(target.charAt(i)-'0' != pivot){
                sum++;
                pivot = target.charAt(i) - '0';
            }
        }
        return sum;
    }
}
