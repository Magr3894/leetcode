class lc674 {
    public int findLengthOfLCIS(int[] nums) {

        int n = nums.length;
        if(n==0)return 0;
        int max_len = 1;
        int start = 0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {

            }else
            {
                if(i-start>=max_len)
                {
                    max_len = i-start;
                    //System.out.println("m:"+max_len);

                }
                start = i;
            }
        }
        max_len = Math.max(max_len, n-start);
        System.out.println(start);
        return max_len;
    }
}