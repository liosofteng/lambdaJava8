//Simple lambda implementation (functional) programming

package io.javalambda;

public class Sora {

	public void greet(soragreets soragreets) {
		soragreets.perform();
	}
	
	public static void main(String[] args) {
		
		//new instance of Sora
		Sora greeter = new Sora();
		
		//lambda implementation
		//note: no args are used
		soragreets lambdaGreeting = () -> System.out.print("Hello World!");
		
		//anonymous inner class
		soragreets innerClassGreeting = new soragreets() {
			public void perform() {
				System.out.print("Hello World!");
			}
		};
		
		//showing that the function greet does not care if
		//a lambda is passed or an inner class
		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
		
	}
	
}
