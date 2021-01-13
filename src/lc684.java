public class lc684 {


        int findFather(int[] father,int x)
        {
            int a = x;
            while(a!=father[a])
            {
                a = father[a];
            }

            while(x!=father[x])
            {
                int z = father[x];
                father[x] = a;
                x = z;
            }
            return a;
        }
        void union(int a, int b,int[] father)
        {
            int fatherA = findFather(father,a);
            int fatherB = findFather(father,b);
            if(fatherA!=fatherB)
            {
                father[fatherA] = Math.min(fatherA,fatherB);
                father[fatherB] = Math.min(fatherA,fatherB);
            }
        }

        public int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            int[] father = new int[n+1];
            int [] ans = new int[2];
            for(int i=1;i<=n;i++)
            {
                father[i] = i;
            }
            for(int i=0;i<n;i++)
            {
                int a = edges[i][0];
                int b = edges[i][1];
                int fatherA = findFather(father,a);
                int fatherB = findFather(father,b);
                if(fatherA!=fatherB)
                {
                    union(a,b,father);
                }else
                {
                    ans[0] = Math.min(a,b);
                    ans[1] = Math.max(a,b);
                }
            }
            return ans;
        }
    }

