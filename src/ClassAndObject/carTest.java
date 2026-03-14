package ClassAndObject;
public class carTest {
	String brand;
	String model;
	int year;
	public static void main(String[] args) {
	carTest c1=new carTest();
	c1.brand="Toyota";
	c1.model="Camry";
	c1.year=2020;
	System.out.println(c1.brand + " " + c1.model + " " + c1.year); //Toyota Camry 2020
	System.out.println("------------------");
	carTest c2=new carTest();
	c2.brand="Honda";
	c2.model="Accord";
	c2.year=2019;
	System.out.println(c2.brand + " " + c2.model + " " + c2.year);  //Honda Accord 2019
	System.out.println("------------------");
	carTest c3=new carTest();
	c3.brand="Ford";
	c3.model="Fusion";
	c3.year=2018;
	System.out.println(c3.brand + " " + c3.model + " " + c3.year); //Ford Fusion 2018
	System.out.println("------------------");
	carTest c4=new carTest();
	c4.brand="Audi";
	c4.model="A6";
	c4.year=2017;
	System.out.println(c4.brand + " " + c4.model + " " + c4.year); //Audi A6 2017
	System.out.println("-----------------------");
	System.out.println("--------c1=c2----------");
	c1=c2;
	System.out.println(c1.brand + " " + c1.model + " " + c1.year); //Honda Accord 2019
	System.out.println(c2.brand + " " + c2.model + " " + c2.year); //Honda Accord 2019
	System.out.println(c3.brand + " " + c3.model + " " + c3.year); //Ford Fusion 2018
	System.out.println(c4.brand + " " + c4.model + " " + c4.year); //Audi A6 2017
	System.out.println("--------c2=c3----------");
	c2=c3;
	System.out.println(c1.brand + " " + c1.model + " " + c1.year); //Honda Accord 2019
	System.out.println(c2.brand + " " + c2.model + " " + c2.year); //Ford Fusion 2018
	System.out.println(c3.brand + " " + c3.model + " " + c3.year); //Ford Fusion 2018
	System.out.println(c4.brand + " " + c4.model + " " + c4.year); //Audi A6 2017
	System.out.println("--------c3=c4----------");
	c3=c4;
	System.out.println(c1.brand + " " + c1.model + " " + c1.year); //Honda Accord 2019
	System.out.println(c2.brand + " " + c2.model + " " + c2.year); //Ford Fusion 2018
	System.out.println(c3.brand + " " + c3.model + " " + c3.year); //Audi A6 2017
	System.out.println(c4.brand + " " + c4.model + " " + c4.year); //Audi A6 2017
	System.out.println("--------c4=c1----------");
	c4=c1;
	System.out.println(c1.brand + " " + c1.model + " " + c1.year); //Honda Accord 2019
	System.out.println(c2.brand + " " + c2.model + " " + c2.year); //Ford Fusion 2018
	System.out.println(c3.brand + " " + c3.model + " " + c3.year); //Audi A6 2017
	System.out.println(c4.brand + " " + c4.model + " " + c4.year); //Honda Accord 2019
	}
}