class NumberStore {

    // Private array
    private int[] numbers = new int[5];

    // Insert numbers
    public void insertNumbers(int[] arr) {
        for (int i = 0; i < 5; i++) {
            numbers[i] = arr[i];
        }
    }

    // Display numbers
    public void displayNumbers() {
        System.out.println("Numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }

    // Count even and odd
    public void countEvenOdd() {
        int even = 0, odd = 0;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}

public class M {
    public static void main(String[] args) {

        NumberStore n = new NumberStore();

        int[] data = {10, 15, 20, 25, 30};

        n.insertNumbers(data);
        n.displayNumbers();
        n.countEvenOdd();
    }
}