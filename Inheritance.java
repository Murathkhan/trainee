class House {
    protected String type = "Two story";
    public void honk(){
        System.out.println("For Rent!!!");
    }
}
class Main extends House{
    private int price = 250000;
    public static void main(String[] args) {
        Main obj = new Main();
        obj.honk();
        System.out.println(obj.type +"  @"+ obj.price);
    }
}