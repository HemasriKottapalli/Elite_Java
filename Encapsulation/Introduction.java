package Encapsulation;
class Animal{
    String name;
	String sound;
    void setName(String name) {
		this.name=name;
	}
	void setSound(String sound) {
		this.sound=sound;
	}
	String getName() {
		return name;
	}
    String getSound() {
		return sound;
	}
}
public class Introduction {

	public static void main(String[] args) {
		/*
		 * Encapsulation is defined as the wrapping up of data under a single unit. 
		 * It is the mechanism that binds together code and the data it manipulates.
		 */
		Animal anm = new Animal();
		anm.setName("cat");
		anm.setSound("meow");
		System.out.println("name: "+anm.getName());
		System.out.println("sound: "+anm.getSound());
        //setter and getter methods helps to provides encapsulation
	}

}
