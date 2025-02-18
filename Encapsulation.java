class Person {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0)
            this.age = age;
        else
            System.out.println("Enter a valid age, must be a positive number");
    }
}
class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Khan");
        person.setAge(21);
        
        System.out.println("Name :"+person.getName()+"\nAge :"+person.getAge());
    }
}
