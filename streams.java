import java.util.*;
	class Main {
		public 	static void main(String [] args){
		    ArrayList<Integer> list = new ArrayList<>();
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    for(int i=0;i<size;i++){
		        int val = scan.nextInt();
		        list.add(val);
		    }
			    list.stream()
					.filter(n -> n%2==0)
					.forEach(n-> System.out.println(n));
			}	
		}
