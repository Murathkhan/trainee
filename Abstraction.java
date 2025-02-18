abstract class Car{
    abstract void display();
    void show(){
        System.out.println("Not infront of BWM.");
    }
}
class Audi extends Car{
    void display(){
        System.out.println("Audi is the best Car.");
    }
}
class Main {
    public static void main(String[] args) {
        Audi obj = new Audi();
        obj.display();
        obj.show();
    }
}
