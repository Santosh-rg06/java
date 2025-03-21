class Soap {
 String brand;
 byte weightingrams;
 short price;
 int quantity;
 long barcode;
 float length;
 double width;
 boolean isfragrent;
 char grade;
 
 
 public void initialize(String brand, byte weight, short price, int quantity, long barcode, 
 float length, double width, booolean isfragrent, char grade){
	 
	  printDetails();
	  weightInGrams = w;
        price = p;
        quantity = q;
        barcode = b;
        length = l;
        width = wd;
        isFragrant = f;
        grade = g;
        brand = br;
 }  
			static void printDetails() {
        System.out.println("Soap Details:");
        System.out.println("Weight: " + weightInGrams + "g");
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Barcode: " + barcode);
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Fragrant: " + isFragrant);
        System.out.println("Grade: " + grade);
        System.out.println("Brand: " + brand);
        
    }
         public static void main(String[] args) {
        // First Initialization and Printing
        initializeAndPrint((byte) 100, (short) 50, 10, 123456789012L, 7.5f, 3.2, true, 'A', "Dove");

        // Re-initialization and Printing
        initializeAndPrint((byte) 120, (short) 60, 15, 987654321098L, 8.0f, 3.5, false, 'B', "Lux");
   }
 
}