class A {
    void show() {
        System.out.println("Class A Method");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B Method");
    }
}

class C extends B {
    void show() {
        System.out.println("Class C Method");
    }
}

public class MultilevelExample3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
