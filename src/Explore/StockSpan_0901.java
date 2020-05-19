package Explore;

import java.util.ArrayList;
import java.util.List;

public class StockSpan_0901 {

    class StockSpanner {
        List<Integer> list;
        List<Integer> weightList;

        public StockSpanner() {
            list = new ArrayList<>();
            weightList = new ArrayList<>();
        }

        public int next(int price) {
            if(list.size() == 0){
                list.add(price);
                weightList.add(1);
                return 1;
            }
            int flag = list.size()-1;
            int weiFlag = 1;
            for(int i = list.size()-1; i >= 0;){
                if(list.get(i) > price){
                    list.add(price);
                    weightList.add(weiFlag);
                    return weiFlag;
                } else{
                    weiFlag += weightList.get(i);
                    i -= weightList.get(i);
                }

            }
            list.add(price);
            weightList.add(weiFlag);
            return weiFlag;
        }
    }
}
