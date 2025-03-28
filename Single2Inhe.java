class A {  
    int i = 10;  
    public void display() {  
        System.out.println("Class A: " + i);  
    }  
}  
class B extends A {  
    int i = 20;  
    public void display() {  
        super.display();  
        System.out.println("Class B: " + i);  
    }  
}  
public class Single2Inhe {  
    public static void main(String[] args) {  
        B obj = new B();  
        obj.display();  
    }  
}   