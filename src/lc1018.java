import java.util.ArrayList;
import java.util.List;

public class lc1018 {

        public List<Boolean> prefixesDivBy5(int[] A) {
            int n = A.length;
            List<Boolean> list = new ArrayList<>();
            if(n==0)return list;
            int p=0;
            for(int i=0;i<A.length;i++)
            {
                p =((p<<1)+A[i])%5;
                if(p==0)list.add(true);
                else list.add(false);
            }
            // System.out.println(judge(A,1));
            return list;
        }

}
