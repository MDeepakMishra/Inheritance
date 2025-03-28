 class A {
    void add(int a , int b){
        int c ;
        System.out.println("ADDITION OF TWO INTEGERS NUMBERS");
        c = a + b;
        System.out.println(c);
    }
}

class B extends A{
    void add(int a , int b , int d){
        int c ;
        System.out.println("ADDITION OF Three Integers NUMBERS");
        c = a + b + d;
        System.out.println(c);

    }
}

class Overring1{
    public static void main(String[] args) {
        B b = new B();
       // b.add(1, 2 ,9);
        b.add(4 , 9);
    }
}
