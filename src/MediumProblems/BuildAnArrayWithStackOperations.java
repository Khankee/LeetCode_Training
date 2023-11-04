package MediumProblems;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        int[] target = {1,2};
        System.out.println(buildArray(target, 4));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> stack = new ArrayList<>();

        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                stack.add("Push");
                break;
            }
            if (idx < target.length) {
                if (i == target[idx]) {
                    stack.add("Push");
                    idx += 1;
                } else {
                    stack.add("Push");
                    stack.add("Pop");
                }
            }
            if(idx == target.length)break;
        }
        return stack;
    }
}
