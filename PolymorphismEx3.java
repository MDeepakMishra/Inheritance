// Third Example Of Run time polymorphism 
class Animal {
    
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {
    
    void makeSound() {
        System.out.println("Cat meows");
    }
}


public class PolymorphismEx3 
    {
    public static void main(String[] args) {
        
        Animal myAnimal; 
        
        myAnimal = new Dog(); 
        myAnimal.makeSound(); 

        myAnimal = new Cat(); 
        myAnimal.makeSound(); 
    }
}
