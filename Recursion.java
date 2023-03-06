
public class Recursion {
	public static int count =0;
    public static void helloHema()
    {   count++;
        if(count<=10)
        {
        	System.out.println("hello hema!~");
        	helloHema(); //recursion
        }
    }
	public static void main(String[] args) {
	    helloHema();
	}

}
