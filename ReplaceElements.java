class Solution {
    public int[] replaceElements(int[] arr) {
        int[] b=new int[arr.length];
        for(int i=0;i<arr.length-1;i++)
        {
        int lar=arr[i+1];
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]>lar)
            {
                lar=arr[j];
            }
        }
        b[i]=lar;

        }
        b[arr.length-1]=-1;
        return b;
        
        
    }
}