class OverloadExample5 {
    void greet() {
        System.out.println("Hello!");
    }

    protected void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        OverloadExample5 obj = new OverloadExample5();
        obj.greet();
        obj.greet("Deepak");
        obj.greet("Roshan Mishra", 25);
    }
}
