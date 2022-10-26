public class ValidUtf8_393 {

    public static  void  main(String []args) {
        //  System.out.println(new SuperPow_372().superPow(2, new int[]{1,0}));
        System.out.println(new ValidUtf8_393().validUtf8(new int[]{128,130}));
        System.out.println(new ValidUtf8_393().validUtf8(new int[]{250,145,145,145,145}));
        System.out.println(new ValidUtf8_393().validUtf8(new int[]{197,130,1}));
        System.out.println(new ValidUtf8_393().validUtf8(new int[]{235,140,4}));
        System.out.println(new ValidUtf8_393().validUtf8(new int[]{145}));
    }

    public boolean validUtf8(int[] data) {
        int pos = 0;
        while (pos < data.length) {
            int mask = 1 << 7;
            int count = 0;
            while ((data[pos] & mask) != 0) {
                count++;
                mask = mask >> 1;
            }
            if (count > 4 || count == 1) {
                return false;
            }
            pos++;
            count = count > 1 ? count - 1 : count;
            for (int i = 0; i < count; i++) {
                if (pos >= data.length || !((data[pos] & (1 << 7)) != 0 && (data[pos] & (1 << 6)) == 0)) {
                    return false;
                }
                pos++;
            }

        }
        return true;
    }
}
