package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OJInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println(scanner.nextInt());
            
        }
    }
    class Item{
        List<Item> attach = new ArrayList<>();
        int value;
        int prime;
        public Item(int val, int pri){
            this.value = val;
            this.prime = pri;
        }
    }
}
