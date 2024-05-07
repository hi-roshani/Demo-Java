import java.util.ArrayDeque;
import java.util.Deque;

public class DeQue {
    public static void main(String[] args) {

        Deque<String> food = new ArrayDeque<>();
        food.add("Bread");
        food.add("Tomatoes");
        food.add("Salt");
        food.add("Pepper");

        food.offerFirst("Plate");
        food.offerLast("Spoon");

        while (!food.isEmpty()) {
            System.out.println(food.pop());
        }

    }
}