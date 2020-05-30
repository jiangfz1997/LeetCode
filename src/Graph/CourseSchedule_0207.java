package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule_0207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] numC = new int[numCourses];
        List<List<Integer>> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            l.add(new ArrayList<>());
        }

        for(int[]cp : prerequisites){
            numC[cp[0]]++;
            l.get(cp[1]).add(cp[0]);
        }

        for(int i = 0; i < numCourses; i++)
            if(numC[i] == 0) q.add(i);

        while(!q.isEmpty()){
            int tmp = q.poll();
            numCourses--;
            for(int k : l.get(tmp)){
                if(--numC[k] == 0) q.add(k);
            }
        }

        return numCourses == 0;
    }
}
