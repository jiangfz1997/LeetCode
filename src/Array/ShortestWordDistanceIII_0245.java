package Array;

public class ShortestWordDistanceIII_0245 {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int p1 = words.length;
        int p2 = -words.length;
        int shortest = words.length;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)) p1 = (word1.equals(word2))?p2:i;
            if(words[i].equals(word2)) p2 = i;
            shortest = Math.min(Math.abs(p2-p1), shortest);
        }
        return shortest;
    }
}
