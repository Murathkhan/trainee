class Car {
    public void carSound() {
      System.out.println("CAR SOUND!!!!");
    }
  }
  
  class Gtr extends Car {
    public void carSound() {
      System.out.println("VROOM VROOM");
    }
  }
  
  class Supra extends Car {
    public void carSound() {
      System.out.println("TUTUTUTU..........");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      Car myCar = new Car();  
      Car myGtr = new Gtr();  
      Car mySupra = new Supra();  
      myCar.carSound();
      myGtr.carSound();
      mySupra.carSound();
    }
  }
  