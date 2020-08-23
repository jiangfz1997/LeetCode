package Array;

public class FloodFill_0733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0) return null;
        if(image[sr][sc] != newColor) helper(image, sr,sc, image[sr][sc] , newColor);
        return image;
    }
    public void helper(int[][] image, int sr, int sc, int oldColor, int newColor){
        if(sr<0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) return;
        image[sr][sc] = newColor;
        helper(image, sr-1, sc, oldColor, newColor);
        helper(image, sr, sc-1, oldColor, newColor);
        helper(image, sr+1, sc, oldColor, newColor);
        helper(image, sr, sc+1, oldColor, newColor);

    }
}
