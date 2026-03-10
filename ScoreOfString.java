class Solution {
    public int scoreOfString(String s) {
        int[] c=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char b=s.charAt(i);
            int a=(int)b;
            c[i]=a;

        }
        int sum=0;
        for(int i=1;i<c.length;i++)
        {
            int d=Math.abs(c[i]-c[i-1]);
            sum=sum+d;

        }
        
        return sum;
        
        
    }
}