
/**
 * 考点 快速整数幂
 * 不必纠结leetcode的小数位数的问题
 * 注意负数
 * 注意int的范围，将int转换成long，可以避免这种越界错误
 */
public class lc50 {

    public double myPow(double x, int n)
    {

//        return myPow2(x, n);
       if(n==0||x==1)return 1.0;
       if(n<0)
       {
           long longN = n;
           longN *=-1;
           return quick(1.0/x, longN);
       }else
       {
           return quick(x, n);
       }
    }

    public double quick(double x, long n)
    {
        double ans =1.0;
        double x_contribute = x;
        while(n>0)
        {
            if(n%2==1)
            {
                ans *= x_contribute;
            }
            x_contribute *= x_contribute;
            n/=2;
        }
        return ans;
    }
    public double myPow2(double x, long n)
    {
        /**
         * 基于二分的方法
         */
        if(n==0)return 1;
        else if(n<0)
        {
            n = -n;
            x = 1.0/x;
        }
        if(n==1)return x;
        else
        {
            double temp = myPow2(x, n/2);
            if(n%2==1)
                return x*temp*temp;
            else
                return temp*temp;
        }
    }

    public static void main(String[] args) {
        lc50 task = new lc50();
        double x = 2.00000;
        int n = -2;


        System.out.println(task.myPow(x,n));
    }
}
