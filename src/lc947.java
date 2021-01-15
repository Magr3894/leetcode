public class lc947 {

        int findFather(int x, int[]father,int[][] stones)
        {
            int a = x;
            while(stones[x]!=stones[father[x]])
            {
                x= father[x];
            }
            while(stones[a]!=stones[father[a]])
            {
                int z = father[a];
                father[a] = x;
                a = z;
            }
            return x;
        }
        void union(int a, int b, int[] father,int[][] stones)
        {
            int fatherA = findFather(a,father,stones);
            int fatherB = findFather(b,father,stones);
            if(fatherA!=fatherB)
            {
                father[fatherA] = Math.min(fatherA,fatherB);
                father[fatherB] = Math.min(fatherA,fatherB);
            }
        }


        public int removeStones(int[][] stones) {
            int n = stones.length;
            int[] father = new int[n];
            for(int i=0;i<n;i++)
            {
                father[i] = i;
            }
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(stones[i][0]==stones[j][0]||stones[i][1]==stones[j][1])
                    {
                        union(i,j,father,stones);
                    }
                }
            }
            int ans = 0;
            for(int i=0;i<n;i++)
            {
                if(father[i]!=i)ans++;
            }
            return ans;
        }

}
