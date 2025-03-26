class Animal{  
    void eat(){System.out.println(" i am eating...");}  
    }  
    class Dog extends Animal{  
    void bark(){System.out.println("dog is barking...");}  
    }  
    class BabyDog extends Dog{  
    void weep(){System.out.println("i am weeping...");}  
    }  
    public class Multilevel{  
    public static void main(String args[]){  
    BabyDog d=new BabyDog();  
    d.weep();  
    d.bark();  
    d.eat();  
    }}  