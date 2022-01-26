package methodPart2;

public class Product {
	String productName="Dell Inspiron 15";
	String productdescription="15.60 inch display, Core i5 processor, 8GB RAM ";
	double price=1079.99;
	
	void printProductDetails () {
		System.out.println("Product Details are:"); 
		System.out.println("Product Name: "+productName);
		System.out.println("Product Description: "+productdescription);
		System.out.println("Price in CAD: "+price);
	}
	
}