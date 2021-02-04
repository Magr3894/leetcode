class lc643 {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0.0;
        long sum = 0;
        int left = 0,right = left+k-1;
        for(int i=left;i<=right;i++)
        {
            sum+=nums[i];
        }
        ans = sum*1.0/k;
        left++;
        right++;
        while(right<nums.length)
        {
            sum-=nums[left-1];
            sum+=nums[right];
            ans= Math.max(ans, sum*1.0/k);
            left++;
            right++;
        }
        return ans;

    }
}