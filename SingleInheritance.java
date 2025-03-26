class Parent{
     void bike(){
        System.out.println("This is perent class");
     }
}
 class  Child extends Parent{
      void bycycle(){
        System.out.println("thus is a child class");
      }
}

class SingleInheritance{
    public static void main(String[] args) {
        Child c = new Child();
        c.bike();
        c.bycycle();
    }
}
 