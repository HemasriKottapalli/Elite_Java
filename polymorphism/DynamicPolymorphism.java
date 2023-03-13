package polymorphism;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		//compiler time Polymorphism
		//method overriding
		/*If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.*/
		NagaChaitanya nc = new NagaChaitanya();
		nc.act();
		Nagarjuna na = new Nagarjuna();
		na.act();
        na = new NagaChaitanya();
        na = new Akhil();
        na.act();
	}

}
