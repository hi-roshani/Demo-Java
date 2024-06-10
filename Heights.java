import java.util.Arrays;

public class Heights {




    public static int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int cnt = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != arr[i]) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }
}