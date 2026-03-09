class calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    public static void main(String[] args) {

        calculator c = new calculator();

        System.out.println("Sum of 2 numbers: " + c.add(3,4));
        System.out.println("Sum of 3 numbers: " + c.add(3,4,5));
        System.out.println("Sum of 4 numbers: " + c.add(3,4,5,6));

    }
}