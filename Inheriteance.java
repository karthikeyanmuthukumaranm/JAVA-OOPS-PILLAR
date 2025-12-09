class Animal{
    void sound(){
        System.out.println("some sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dogs Barks");
    }
}

public class Inheriteance {
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
    }
}
