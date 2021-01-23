import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lc989 {

    void reverse1(int[] objects)
    {
        int n = objects.length;
        int i=0,j=n-1;
        while(i<j)
        {
            int tmp = objects[j];
            objects[j] = objects[i];
            objects[i] = tmp;
            i++;
            j--;
        }
    }
    void reverse2(char[] objects)
    {
        int n = objects.length;
        int i=0,j=n-1;
        while(i<j)
        {
            char tmp = objects[j];
            objects[j] = objects[i];
            objects[i] = tmp;
            i++;
            j--;
        }
    }
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList<>();
        String str = String.valueOf(K);
        char[] ch = str.toCharArray();
        int carry = 0;
        reverse1(A);
        reverse2(ch);
        int n1 = A.length;
        int n2 = ch.length;
        for(int i=0;i<n1||i<n2;i++)
        {
            int tmpA = 0;
            if(i<n1)
                tmpA = A[i];
            int tmpB = 0;
            if(i<n2)
                tmpB = ch[i]-'0';
            int res = tmpA+tmpB+carry;
            ans.add(res%10);
            carry = res/10;
        }
        if(carry>0)
            ans.add(1);
        Collections.reverse(ans);

        return ans;
    }

}
