
public class Testing {
	 
	Calculator addition = (a,b) -> a+b;
	
	public int operate(int a,int b, Calculator cal) {
		return cal.operation(a, b);
	}
	
	public static void main(String[] args) {
		Testing t = new Testing();
		System.out.println("Addition = " + t.operate(50, 50, t.addition));
	}	
	
}

interface Calculator {
	int operation(int a, int b);
}
