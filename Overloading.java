 class Overloading {
    void add(int a , int b ){
        int c = a +b ;
        System.out.println(c);
    }
    void add(float a , float b ){
        float c = a + b ;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Overloading obj = new Overloading ();
        obj.add(5.5f, 2.5f);
       // ov.add(2.4 , 1.2);
        obj.add(3, 02);
    }
}
