public class SuperPow_372 {

    public static  void  main(String []args) {
       //  System.out.println(new SuperPow_372().superPow(2, new int[]{1,0}));
        System.out.println(new SuperPow_372().superPow(2147483647, new int[]{2,0,0}));
    }

    public int superPow(int a, int[] b) {
        int ans = 1;
        for (int i = b.length - 1; i >= 0; i--) {
            ans =  (int)((long) ans * quikcPow(a, b[i]) % 1337);
            a = quikcPow(a, 10);
        }
        return ans;
    }
    public int quikcPow(int a, int n) {
        int pow = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                pow = (int)((long) pow * a % 1337);
            }
            a = (int)((long) a * a % 1337);
            n = n >> 1;
        }
        return pow % 1337;
    }
}
