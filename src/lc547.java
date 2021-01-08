import java.util.HashSet;
import java.util.Set;

public class lc547 {

    int findFather(int[] father,int x)
    {
        int a = x;
        while(x!=father[x])
        {
            x = father[x];
        }
        //路径优化

        while(a!=father[a])
        {
            int z = father[a];
            father[a] = x;
            a = z;
        }
        return x;
     }
     void union(int[] father, int x, int y)
     {
         int fatherX = findFather(father,x);
         int fatherY = findFather(father, y);
         if(fatherX!=fatherY)
         {
             father[fatherX] = Math.min(fatherX,fatherY);
             father[fatherY] = Math.min(fatherX,fatherY);
         }
     }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] father = new int[n];
        for (int i = 0; i < n; i++) {
            father[i] = i;
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(isConnected[i][j]==1)
                {
                    union(father,i,j);
                }
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(father[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[][] in = new int[][]{{1,1,1},{1,1,1},{1,1,1}};
        lc547 task = new lc547();
        System.out.println(task.findCircleNum(in));
    }

}
