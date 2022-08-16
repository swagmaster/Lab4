public class CallStack{

	/**
	 * When executed, a try-catch is needed to catch
	 * the ArithmeticException of dividing by 0.
	 */
	void func2 (){
		System.out.println("In func2 method");
		int a = 0;
		int b;
		try{
			System.out.println("Now entering the try block");
			b = 10 / a;
		}catch(ArithmeticException arithEx) {
			System.out.println(arithEx.toString() + " was caught");
			System.out.println("Cannot divide by: " + a);
		}
	}


	/**
	 * Calls func2() which contains a try-catch method
	 */
	void func1(){
		System.out.println("In func1 method");
		this.func2();
		System.out.println("Back in func1 method");
	}


	/**
	 * @param args
	 */
	public static void main (String args[]){
		CallStack myCallStack;
		myCallStack = new CallStack();
		System.out.println("In the main method");
		myCallStack.func1();

	}
}
