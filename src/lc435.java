import java.util.*;

public class lc435 {

    public static void main(String[] args) {

//        int[][] input = { {1,2},{2,3}, {3,4}, {1,3} };
        int[][] input = { {1,2},{2,3} };
        lc435 lc = new lc435();
        System.out.println(lc.eraseOverlapIntervals(input));
    }

    public int eraseOverlapIntervals(int[][] intervals)
    {
        if(intervals.length==0)return 0;

        int ans = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]>o2[1])
                    return 1;
                else if(o1[1]<o2[1])
                    return -1;

                return 0;
            }
        });

        int right = intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=right)
            {
                right = intervals[i][1];
            }else
            {
                ans++;
            }
        }
        return ans;
    }
}
