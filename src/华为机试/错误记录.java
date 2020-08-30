package 华为机试;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class 错误记录 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while(in.hasNext()){
            String[] s = in.nextLine().split(" ");
            String fileName = s[0].substring(s[0].lastIndexOf("\\")+1);
            fileName = fileName.substring(Math.max(fileName.length()-16, 0)) + " " + s[1];
            map.put(fileName, map.getOrDefault(fileName, 0)+1);
        }
        int count = 0;
        for(Map.Entry<String, Integer> item : map.entrySet()){
            if(map.size()-count < 8)
                System.out.println(item.getKey() + " " + item.getValue());
            count++;
        }
    }
}
