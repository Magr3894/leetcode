public class lc1232 {

        public boolean checkStraightLine(int[][] coordinates) {
            int n = coordinates.length;
            if(n==0)return false;
            double k = 0;
            for(int i=1;i<n;i++)
            {
                if(coordinates[i][0]==0&&coordinates[i-1][0]==0)
                {
                    if(k==0)
                        k = Double.MAX_VALUE;
                    else{
                        return Double.compare(k,Double.MAX_VALUE)==0;
                    }
                }else{
                    if(k==0)
                    {
                        k = (coordinates[i][1]-coordinates[i-1][1])*1.0/(coordinates[i][0]-coordinates[i-1][0]);
                    } else
                    {
                        double k1 = (coordinates[i][1]-coordinates[i-1][1])*1.0/(coordinates[i][0]-coordinates[i-1][0]);
                        if(Math.abs(k1-k)>1e-5)return false;
                    }
                }
            }
            return true;
        }
    }

