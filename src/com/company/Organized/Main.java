package com.company.Organized;

public class Main {

    public static void main(String[] args) {
        System.out.println("first shirt object ");
	 shirt s1 = new shirt(8, 10);
	 s1.display();
        System.out.println("Second shirt object");
	 shirt s2 = new shirt(10,10);
	 s2.display();
        System.out.println("Third shirt objec");
	 shirt s3 = new shirt(12,10);
	 s3.display();

	 Account ac1 = new Account(12334313, 12345.9876);
	 ac1.display();

	 Account ac2 = new Account(12345623, 87695432.12345);
	 ac2.display();
    }
}
