package Capgemini.java4;

import java.security.DomainLoadStoreParameter;

//final keyword
//with class can not be extented
//method can not be override
//variable value can be changed


abstract class mobile{
	final int price=1000;
	abstract public void calling();
	abstract public void sendSMS();
	
	public void chargigngUSB() {
		System.out.println("USB charging");
	}
}

//class be extends

class google extends mobile{
	
	@Override
	public void calling() {
		System.out.println("Google is calling");
	}
	
	public void sendSMS() {
		System.out.println("Send sms using Google");
	}
	public void android() {
		System.out.println("Android phone");
	}
}
public class Abstraction {
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		System.out.println("hi");
		
	}
}
