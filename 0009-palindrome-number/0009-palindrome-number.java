class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int n=x;
        while(x>0){
            int rem=x%10;
            x=x/10;
            a=a*10+rem;
        }
        if(n==a){
            return true;
        }
        else{
            return false;
        }
        
    }
}