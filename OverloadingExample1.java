class OverloadingExample1 {
    void show() {
        System.out.println("No parameters");
    }

    void show(int a) {
        System.out.println("One parameter: " + a);
    }

    void show(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverloadingExample1 obj = new OverloadingExample1();
        obj.show();
        obj.show(10);
        obj.show(10, 20);
    }
}
