package io.javalambda;

public class SoraRunable {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			//runnable inner class
			@Override
			public void run() {
				System.out.println("Sora printed inside runnable!");				
			}
		
		});
		
		//print runnable
		myThread.run();
		
		//lambda implementation of runnable
		Thread myLambdaThread = new Thread(()-> System.out.println("Sora's Lambada printed inside runnable"));
		myLambdaThread.run();
	}

}
