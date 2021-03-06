package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PossibleBipartition_0886 {
    class Solution {
        List<List<Integer>> graph = new ArrayList<>();
        Map<Integer, Integer> color = new HashMap<>();

        public boolean possibleBipartition(int N, int[][] dislikes) {
            for (int i = 1; i <= N + 1; ++i) graph.add(new ArrayList());

            for (int[] edge : dislikes) {
                graph.get(edge[0]).add(edge[1]);
                graph.get(edge[1]).add(edge[0]);
            }

            for (int node = 1; node <= N; ++node) {
                if (!color.containsKey(node) && !dfs(node, 0)) return false;
            }

            return true;
        }

        private boolean dfs(int node, int color) {
            if (this.color.containsKey(node)) return this.color.get(node) == color;

            this.color.put(node, color);

            for (int neighbor : graph.get(node)) {
                if (!dfs(neighbor, color ^ 1)) return false;
            }

            return true;
        }
    }
}
