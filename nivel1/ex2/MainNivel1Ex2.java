package nivel1.ex1.ex2;

public class MainNivel1Ex2 {

    public static void main(String[] args) {
        System.out.println("Generics\n");

        GenericMethods<Object> example1 = new GenericMethods<Object>("Some", 8, new Person("Lilo","Lopez",45));
        System.out.println("Example 1: " + example1 + "\n");

        example1.setObject1(true);
        example1.setObject2(new Person("Lorena","Torres",45));
        example1.setObject3(10);
        
        System.out.println("Example after modification: " + example1 + "\n");

        System.out.println("Parameter 1: " + example1.getObject1()
         				+ "\nParameter 2: " + example1.getObject2()  
         				+ "\nParameter 3: " + example1.getObject3());
    }
}

