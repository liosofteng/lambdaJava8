package io.javalambda;

//implements soragreets interface
public class SoraOnlySaysHello implements soragreets {
	
	@Override
	public void perform() {
		System.out.println("Hello World!!");
	}
}
