import java.util.HashMap;
import java.util.Map;

class lc888 {

    int getSum(int[] A)
    {
        int sum = 0;
        for(int i =0;i<A.length;i++)
            sum+=A[i];
        return sum;
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] ans = new int[2];
        int sumA = getSum(A);
        int sumB = getSum(B);

        int delta = (sumA-sumB)/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(A[i],1);
        for(int i=0;i<m;i++)
        {
            if(map.get(B[i]+delta)!=null)
            {
                ans[0] = B[i]+delta;
                ans[1] = B[i];
                return ans;
            }
        }


        return ans;
    }

}