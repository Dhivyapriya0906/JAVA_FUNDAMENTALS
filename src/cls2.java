public class cls2 {
    public static void main(String[] args){
        Dog d=new Dog();
        d.move();
        d.eat();
    }
}           //super keyword and Method overriding
 class Animal{
    void move(){
        System.out.println("Animal Moving");
    }
    void eat(){
        System.out.println("Animal Eating");
    }
}
 class Dog extends Animal{
    //@Override
    void move(){
        //super.move();
        System.out.println("dog moving");

    }
    void eat(){
        //super.eat();
        System.out.println("Dog Eating");
    }
}
