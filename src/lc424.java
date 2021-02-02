public class lc424 {

    public int characterReplacement(String s, int k) {
        int max = -1;
        int[] num = new int[26];
        char[] str = s.toCharArray();
        int l=0,r=l;
        while(r<str.length)
        {
            num[str[r]-'A']++;
            max = Math.max(max,num[str[r]-'A']);
            if(r-l+1-max>k)
            {
                num[str[l]-'A']--;
                l++;
            }
            r++;

        }
        return r-l;

    }
}
