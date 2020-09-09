package String;

public class SolveEquation_0640 {
    public String solveEquation(String equation) {
        String[] s = equation.split("=");

        int[] sum1 = helper(s[0]);
        int[] sum2 = helper(s[1]);

        if(sum1[0] - sum2[0] == 0 && sum1[1] - sum2[1] == 0) return "Infinite solutions";
        if(sum1[0] - sum2[0] == 0) return "No solution";
        int a = (sum1[1] - sum2[1])/(sum2[0] - sum1[0]);
        return "x=" + a;
    }
    public int[] helper(String s){
        int xNum = 0;
        int num = 0;
        int flag = 1;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(!Character.isDigit(s.charAt(j))){
                    if(s.charAt(j) == 'x'){
                        if(i == j){
                            xNum += flag;
                            break;
                        }else{
                            int k = Integer.parseInt(s.substring(i, j)) ;
                            xNum += k*flag;
                            i = j;
                            break;
                        }
                    }else{
                        if(i != j)
                            num += Integer.parseInt(s.substring(i, j))*flag;
                        if(s.charAt(j) == '-')
                            flag = -1;
                        else if(s.charAt(j) == '+')
                            flag = 1;
                        i = j;
                        break;
                    }
                }else{
                    if(j == s.length()-1){
                        num +=  Integer.parseInt(s.substring(i, j+1))*flag;
                        i = j;
                        break;
                    }
                }
            }
        }
        int[] nums = {xNum, num};
        return nums;

    }

    public static void main(String[] args) {
        SolveEquation_0640 s = new SolveEquation_0640();
        System.out.println(s.solveEquation("1-x+x-x+x+x=99"));
    }
}
