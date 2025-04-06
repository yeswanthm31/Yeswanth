 class Solution {
    public int divide(int dividend, int divisor) {
       double x=dividend,y=divisor;
       if(x==y) return 1;
       if(y==1)return (int)x;
       if(y==-1)return (int)(-x);

        int r=(int)Math.floor(x/y);
        if(r<0 && x%y !=0)return r+1;
        return r;
    }
}
        
