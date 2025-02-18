import java.util.*;
class LengthException extends Exception{
    public LengthException(String s){
        super(s);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int size = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<size;i++){
            String a = scan.nextLine();
            list.add(a);
        }
        int count = 0;
        try{
            for(String i:list){
                if(i.length()>5)
                    count++;
            }
            if(count>0){
                System.out.println("Found");
            }
            else
                throw new LengthException("Not Found");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
