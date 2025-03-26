 class A {
     void add(){
        System.out.println("ADDITION OF TWO NUMBER IS");
        int  a = 5 , b = 8 , c ;
        c = a + b ;
        System.out.println(c);
     }    
}

class B extends A{
    void sub(){
        System.out.println("Subtrction OF TWO NUMBER IS");
        int  a = 5 , b = 8 , c ;
        c = a - b ;
        System.out.println(c);
    }
} 
class SingleInhe2{
    public static void main(String[] args) {
        System.out.println("I CALL THE ALL METHODS BY CHILD CLASS OBJECT");
        B b = new B();
        b.add();
        b.sub();
        System.out.println("NOW I AM AGAIN CALL PARENT METHODS BY PARENT CLASS OBJECT");
        A a = new A();
        a.add();
    }
}
