
public class TestStack {
    public static void main(String[] args) {
        LinkedListStack<Integer> test = new LinkedListStack<>();

        test.push(10);
        test.push(20);
        test.push(40);

        System.out.println(test.toString());

        test.pop();
        test.pop();
        System.out.println(test.toString());

    }
}
