import java.util.ArrayDeque;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.push(1);
        adq.push(2);

        System.out.println(adq);
        adq.pop();
        System.out.println(adq);
        adq.add(34);
        System.out.println(adq);

    }

}
