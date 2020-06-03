package String;

public class CountAndSay_0038 {
    public String countAndSay(int n) {
        StringBuffer sb = new StringBuffer();
        String tmp = "1";
        if(n == 1){
            return tmp;
        }else{
            tmp = countAndSay(--n);

            for(int i = 1; i <= tmp.length(); ){
               String start = tmp.substring(i-1,i);
               int count = 0;
               int j = i;
                for(; j <= tmp.length(); j++){
                    String end = tmp.substring(j-1, j);
                    if(start.equals(end)){
                        count++;
                    } else{
                        break;
                    }
                }
                sb.append(Integer.toString(count));
                sb.append(start);
                i = j;
            }
        }
    return sb.toString();
    }

    public static void main(String args[]){
        CountAndSay_0038 c = new CountAndSay_0038();
        String a = c.countAndSay(4);
        System.out.println(a);
    }
}
