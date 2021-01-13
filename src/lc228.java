import java.util.ArrayList;
import java.util.List;

public class lc228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        if(n==0)return null;
        int i = 0,j=i;
        while(i<n&&j<n)
        {
            while(j<n&&nums[j]-nums[i]==j-i)j++;
            if(i==j) {
                ans.add(String.valueOf(nums[i]));
                i+=1;
                j+=1;
            }else
            {
                if(nums[i]==nums[j-1])
                {
                    ans.add(String.valueOf(nums[i]));
                }else
                {

                    ans.add(nums[i]+"->"+nums[j-1]);
                }
                i = j;
            }
        }
        return ans;

    }
    public void visit(List<String> list)
    {
        for(String str:list)
        {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        lc228 task = new lc228();
        int[] nums = new int[]{0,1,2,4,5,7};
        task.visit(task.summaryRanges(nums));
    }
}
