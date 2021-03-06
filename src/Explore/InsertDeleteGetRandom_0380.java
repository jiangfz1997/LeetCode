package Explore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom_0380 {
    class RandomizedSet {
        private HashMap<Integer, Integer> mp;
        private List<Integer> list;
        Random rand = new Random();
        /** Initialize your data structure here. */
        public RandomizedSet() {
            this.mp = new HashMap();
            this.list = new ArrayList();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if(mp.containsKey(val)) return false;

            mp.put(val, list.size());
            list.add(list.size(),val);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if(!mp.containsKey(val)) return false;

            int last = list.get(list.size()-1);
            int idex = mp.get(val);
            list.set(idex, last);
            mp.put(last, idex);
            list.remove(list.size()-1);
            mp.remove(val);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }

}
