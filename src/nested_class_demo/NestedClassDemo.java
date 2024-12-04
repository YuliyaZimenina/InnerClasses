package nested_class_demo;

public class NestedClassDemo {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outerObject = new Outer(numbers);

        outerObject.analyze();
    }
}
