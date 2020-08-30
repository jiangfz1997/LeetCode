package 华为机试;

import java.util.Scanner;

public class IP地址检测 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = 0, B = 0, C = 0, D = 0, E = 0, Error = 0, priv = 0;
        while(in.hasNext()){
            String s = in.nextLine();
            String[] array = s.split("~");
            String s2 = array[0];
            String[] ip = s2.split("\\.");
            String[] mask = array[1].split("\\.");
            String[] result = judge(ip, mask).split(",");
            if(result.length > 1) priv++;
            switch(result[0]){
                case "A": A++; break;
                case "B": B++; break;
                case "C": C++; break;
                case "D": D++; break;
                case "E": E++; break;
                case "Error": Error++; break;
            }
        }
        System.out.println(A + " " + B + " " + C + " " + D + " " + E + " " + Error + " " + priv);
    }

    public static String judge(String[] ip, String[] mask){
        if(ip.length != 4 || mask.length != 4) return "Error";
        String type = null;
        int ipHead = 0;
        int ipSecond = 0;
        for(int i = 0; i < 4; i++){
            String s = ip[i];
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(!Character.isDigit(c)) return "Error";
            }
            int head = Integer.parseInt(s);
            if(head <0 || head > 255) return "Error";
            if(i == 0){
                if(head == 0 || head == 127) type = "else";
                else if(head >= 1 && head <= 126) type = "A";
                else if(head >= 128 && head <= 191) type = "B";
                else if(head <= 223) type = "C";
                else if(head <= 239) type = "D";
                else if(head <= 255) type = "E";
                ipHead = head;
            }
        }
        int flag = 1;
        for(int i = 0; i < 4; i++){
            String s = mask[i];
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                if(!Character.isDigit(c)) return "Error";
            }
            int num = Integer.parseInt(s);
            if(num < 0 || num > 255) return "Error";
            String bNum = Integer.toBinaryString(num);
            if(bNum.length() < 8) bNum = trans(bNum);
            for(int j = 0; j < bNum.length(); j++){
                if(flag == 1 && bNum.charAt(j)-'0' == 0) flag = 0;
                else if(flag == 0 && bNum.charAt(j) - '0' == 1) return "Error";
            }
        }
        if(ipHead == 10 || (ipHead == 172 && ipSecond >= 16 && ipSecond <= 31) || (ipHead == 192 && ipSecond == 168))
            type += ",Private";
        return type;
    }
    public static String trans(String s){
        int distance = 8-s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < distance; i++)
            sb.append("0");
        return sb.append(s).toString();
    }
}
