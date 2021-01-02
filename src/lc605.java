public class lc605 {


    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(n==0)return true;
        if(len==1)
        {
            return flowerbed[0]==0;
        }
        for (int i = 0; i < len; i++) {
            //边界处理
            if(i==0)
            {
                if(i+1<len&&flowerbed[i+1]==0&&flowerbed[i]==0)
                {
                    n--;
                    flowerbed[i] = 1;
                }
            }else if(i==len-1)
            {
                if(i-1>=0&&flowerbed[i-1]==0&&flowerbed[i]==0)
                {
                    n--;
                    flowerbed[i] = 1;
                }
            }else
            {
                if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0)
                {
                    n--;
                    flowerbed[i] = 1;
                }

            }

        }
        return n<=0;
    }

    public static void main(String[] args) {
        int[] flowered ={0,1,0};
        int n = 1;
        lc605 task = new lc605();
        System.out.println(task.canPlaceFlowers(flowered,n));
    }
}
