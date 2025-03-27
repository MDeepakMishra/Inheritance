class OverloadExample3 {
    void print(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    void print(String b, int a) {
        System.out.println("String: " + b + ", Integer: " + a);
    }

    public static void main(String[] args) {
        OverloadExample3 obj = new OverloadExample3();
        obj.print(10, "Java");
        obj.print("Programming", 20);
    }
}
