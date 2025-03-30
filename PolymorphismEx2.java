// Example Of Run time polymorphism 
class Test {
     void add( int i , int j){
        System.out.println("This is Parent class");
        int k = i + j;
        System.out.println(k);
     }
}

class Test1 extends Test{
    void add( int i , int j ){
        System.out.println("This is child class");
        int k = i + j ;
        System.out.println(k);
     }
}

public class PolymorphismEx2 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.add(3, 4);
    }
}
