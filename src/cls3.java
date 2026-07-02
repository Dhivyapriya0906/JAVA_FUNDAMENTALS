public class cls3 {
    public static void main(String[] args){
        Animal1 a =new Dog1();
        a.sound1();
    }
}
interface  Animal1{
    void sound1();
}
class Dog1 implements Animal1{
    @Override
    public void sound1(){
        System.out.println("Barking");
    }
}
