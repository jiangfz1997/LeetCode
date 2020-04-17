package Array;

public class GasStation_0134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] tmp = new int[gas.length];
        for(int i = 0; i < gas.length; i++){
            tmp[i] = gas[i] - cost[i];
        }

        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] >=0){
                int j = 0, carry = 0;
                for(int k = i; j < tmp.length; j++ ){
                    carry += tmp[k];
                    if(carry < 0){
                        break;
                    }
                    if(k == tmp.length - 1){
                        k = 0;
                    }else{
                        k++;
                    }
                }
                if(j == tmp.length){
                    return i;
                }
            }
        }   return -1;
    }
}
