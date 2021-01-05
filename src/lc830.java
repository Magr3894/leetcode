import java.util.ArrayList;
import java.util.List;

public class lc830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        if(s.length()==0)return null;
        List<List<Integer>> ans = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(start))
            {
                if(i-start>=3)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    list.add(i-1);
                    ans.add(list);
                }
                start = i;
            }
            if(i==s.length()-1&&s.charAt(i)==s.charAt(start)&&i-start+1>=3)
            {
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(i);
                ans.add(list);
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        String s = "aaa";
        lc830 task = new lc830();
        task.largeGroupPositions(s);
    }
}
