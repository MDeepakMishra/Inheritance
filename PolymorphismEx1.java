// Example Of Complie time polymorphism 
class Test {
     void add( int i , int j){
        int k = i + j;
        System.out.println(k);
     }
     void add( int i , int j , int l){
        int k = i + j + l;
        System.out.println(k);
     }
}

public class PolymorphismEx1 {

    public static void main(String[] args) {
        Test t = new Test();
        t.add(3, 4, 8);
    }
}