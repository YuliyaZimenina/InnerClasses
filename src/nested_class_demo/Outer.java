package nested_class_demo;

// Using an inner class
public class Outer {
    int[] numbers;

    Outer(int[] nums) {
        numbers = nums;
    }

    void analyze() {
        Inner innerObject = new Inner();
        System.out.println("Minimum value: " + innerObject.minValue());
        System.out.println("Maximum value: " + innerObject.maxValue());
        System.out.println("Average value: " + innerObject.average());
    }

    // Inner class
    class Inner {
        int minValue() {
            int min = numbers[0];

            for (int i = 1; i < numbers.length; i++)
                if (numbers[i] < min) min = numbers[i];
            return min;
        }

        int maxValue() {
            int max = numbers[0];

            for (int i = 1; i < numbers.length; i++)
                if (numbers[i] > max) max = numbers[i];
            return max;
        }

        int average() {
            int averageValue = numbers[0];

            for (int i = 0; i < numbers.length; i++)
                averageValue += numbers[i];
            return averageValue / numbers.length;
        }
    }
}