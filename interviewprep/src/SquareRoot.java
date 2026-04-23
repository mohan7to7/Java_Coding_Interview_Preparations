public class SquareRoot {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left =1,right =x/2;
        int ans = 0;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid<=x/mid){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }

    static void main() {
        SquareRoot s = new SquareRoot();
        System.out.println(s.mySqrt(4));
        System.out.println(s.mySqrt(8));
    }
}
