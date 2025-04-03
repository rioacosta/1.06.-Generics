package nivel1.ex1;

public class MainNivel1Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("NoGenerics\n");

	        NoGenericMethods example1 = new NoGenericMethods("One", "Two", "three");
	        System.out.println("Example 1: " + example1+ "\n");

	        example1.setObject1("Live");
	        example1.setObject2("Laugth");
	        example1.setObject3("Love");
	        
	        System.out.println("Example after modification: " + example1);

	        System.out.println("Generic 1: " + example1.getObject1()
	        					+ "\nGeneric 2: " + example1.getObject2()  
	        					+ "\nGeneric 3: " + example1.getObject3());
	}

}
