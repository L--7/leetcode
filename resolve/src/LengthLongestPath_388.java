import java.util.Stack;

public class LengthLongestPath_388 {

    public static  void  main(String []args) {
        System.out.println(new LengthLongestPath_388().lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
    }


    public int lengthLongestPath(String input) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        int pos = 0;
        while (pos < input.length()) {
            int deep = 0;
            while (pos < input.length() && input.charAt(pos) == '\t') {
                deep++;
                pos++;
            }
            boolean isFile = false;
            int length = 0;
            while (pos < input.length() && input.charAt(pos) != '\n') {
                if (input.charAt(pos) == '.' ){
                    isFile = true;
                }
                length++;
                pos++;
            }
            pos++;

            while (!stack.isEmpty() && stack.size() > deep) {
                stack.pop();
            }
            if (isFile) {
                max = Math.max((stack.isEmpty() ? 0 : stack.peek()) + length, max);
            } else {
                stack.push((stack.isEmpty() ? 0 : stack.peek()) + length + 1);
            }
        }
        return max;
    }
}
