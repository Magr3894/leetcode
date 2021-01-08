public class lc189 {
    public void rotate(int[] nums, int k) {
        while (k-->0)
        {
            int temp = nums[nums.length-1];
            for (int i = nums.length-2 ;i >= 0; i--) {
                nums[i+1] = nums[i];
            }
            nums[0] =temp;
        }
    }
    public void reverse(int[] nums,int s,int t)
    {
        for(int i=s;i<=(s+t)/2;i++)
        {
            int temp = nums[i];
            nums[i] = nums[s+t-i];
            nums[t-i+s] = temp;
        }
    }
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        if(k>=n)k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public int gcd(int x, int y)
    {
        return y>0?gcd(y, x%y):x;
    }
    public void rotate3(int[] nums,int k)
    {
        int n = nums.length;;
        k %= n;
        int count = gcd(k,n);
        for (int start = 0; start < count; start++) {
            int current = start;
            int prev= nums[start];
            do{
                int next = (current+k)%n;
                int temp = nums[next];
                nums[next] = prev;
                prev =temp;
                current =next;
            }while (start!=current);
        }
    }
    public void visit(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            if(i!=0)System.out.print(" ");
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        lc189 task = new lc189();
        task.rotate3(nums,k);
        task.visit(nums);
    }
}
