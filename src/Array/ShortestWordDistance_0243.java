package Array;

public class ShortestWordDistance_0243 {
    public int shortestDistance(String[] words, String word1, String word2) {
        int i1 = -1, i2 = -1;
        int minDistance = words.length;
        int currentDistance;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                i1 = i;
            } else if (words[i].equals(word2)) {
                i2 = i;
            }

            if (i1 != -1 && i2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(i1 - i2));
            }
        }
        return minDistance;
    }

    public static void main(String[] args){
        ShortestWordDistance_0243 s = new ShortestWordDistance_0243();
        String[] sb = {"practice", "make", "perfect", "coding", "make"};
        System.out.println(s.shortestDistance(sb, "coding", "practice"));
    }

}
