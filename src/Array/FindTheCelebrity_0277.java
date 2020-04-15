package Array;
/*
 * Copied from the answer!!!

 * How to fix: The celebrity don't know other people,but other people know him, which means that you can go through the array.
 * When found A knows B, then A can not be the one but B could, Then comparing B and C, if B do not know C, continue. Finally, exam the left one if he is the celebrity.
 * Complexity: O(n)
 * What's new: Not for now.
 * What reminds fixed: Non for now
 * */
public class FindTheCelebrity_0277 {



    private int numberOfPeople;

    public int findCelebrity(int n) {
        numberOfPeople = n;
        int celebrityCandidate = 0;
        for (int i = 0; i < n; i++) {
            if (knows(celebrityCandidate, i)) {
                celebrityCandidate = i;
            }
        }
        if (isCelebrity(celebrityCandidate)) {
            return celebrityCandidate;
        }
        return -1;
    }

    private boolean isCelebrity(int i) {
        for (int j = 0; j < numberOfPeople; j++) {
            if (i == j) continue; // Don't ask if they know themselves.
            if (knows(i, j) || !knows(j, i)) {
                return false;
            }
        }
        return true;
    }


}
