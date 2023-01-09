public class AddStrings_415 {


    public static void main(String[] args) {
        System.out.println(new AddStrings_415().addStrings("11", "123"));
    }

    public String addStrings(String num1, String num2) {
        if (num1 == null || num1 == "") {
            return num2;
        }
        if (num2 == null || num2 == "") {
            return num2;
        }
        int next = 0;
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        StringBuffer sb = new StringBuffer();
        while (len1 >= 0 || len2 >= 0) {
            int sum = (len1 < 0 ? 0 : num1.charAt(len1) - '0') + (len2 < 0 ? 0 : num2.charAt(len2) - '0') + next;
            next = sum >= 10 ? 1 : 0;
            sb.append(sum >= 10 ? sum - 10 : sum);
            len1--;
            len2--;
        }
        if (next != 0) {
            sb.append(next);
        }
        return sb.reverse().toString();
    }

}
