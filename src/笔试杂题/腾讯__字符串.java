package 笔试杂题;
import java.util.*;
/*
* 小Q想要给他的朋友发送一个神秘字符串，但是他发现字符串的过于长了，
* 于是小Q发明了一种压缩算法对字符串中重复的部分进行了压缩，
* 对于字符串中连续的m个相同字符串S将会压缩为[m|S](m为一个整数且1<=m<=100)，
* 例如字符串ABCABCABC将会被压缩为[3|ABC]，现在小Q的同学收到了小Q发送过来的字符串，你能帮助他进行解压缩么？
 * */
public class 腾讯__字符串 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        int mutil=0;//乘数
        LinkedList<String> stack_res=new LinkedList();//结果暂存
        LinkedList<Integer> mutil_stack=new LinkedList();
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<str.length();i++) { //toCharArray() 需要O(n)的空间复杂度,不打算使用
            if(str.charAt(i)=='[') {
                stack_res.addLast(temp.toString());//保存上一次的结果 [HG]
                temp=new StringBuilder();//用于接收新的字母[B]
            }else if(str.charAt(i)==']') {
                StringBuilder temp2=new StringBuilder();
                //取出乘数
                int num= mutil_stack.removeLast();
                for(int j=0;j<num;j++) {
                    temp2.append(temp);
                }
                temp=new StringBuilder(stack_res.removeLast()+temp2);
            }else if(str.charAt(i)=='|') {//乘数[3]入栈
                mutil_stack.addLast(mutil);
                mutil=0;//寻找新的乘数比如[2]
            }
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
                //预防数字出现 [ 19  |a]
                mutil=mutil*10+Integer.parseInt(str.charAt(i)+"");
            }else {
                //正常字母
                temp.append(str.charAt(i));
            }
        }
        System.out.print(temp.toString());
    }
}
