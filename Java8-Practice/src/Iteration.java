import java.util.Arrays;
import java.util.List;

public class Iteration {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		/*for(int i =0; i <6; i++) {
			System.out.println(list.get(i));
		}*/
		
		/*for(int i :list) {
			System.out.println(i);
		}*/
		
		/*Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
	
		
		
		list.forEach(t -> System.out.println(t));
	}

}
