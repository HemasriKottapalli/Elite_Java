
public class Strings2 {

	public static void main(String[] args) {
		//escape sequences
		//System.out.println("There is a book called \"Ramayanam\" and it was read by sita.");
        //System.out.println("D:\\Desktop\\Hema\f");
		//Checking identitical twins i.e StringBuilder(v.1.0) and StringBuffer(v.1.5)
		StringBuilder obj = new StringBuilder("abc");
		System.out.println("hashcode of obj before apppend : "+obj.hashCode());
		obj.append("def");
		System.out.println("hashcode of obj after apppend : "+ obj.hashCode());
		
		StringBuffer obj1 = new StringBuffer("abc");
		System.out.println("hashcode of obj before apppend : "+obj1.hashCode());
		obj1.append("def");
		System.out.println("hashcode of obj after apppend : "+obj1.hashCode());
		
		//checking if strings sharing memory address with stringBuffer
		StringBuffer x = new StringBuffer("xyz");
		System.out.println("hashcode of x i.e = xyz : "+x.hashCode());
		StringBuffer y = new StringBuffer("xyz");
		System.out.println("hashcode of y i.e = xyz : "+y.hashCode());
		StringBuffer z= new StringBuffer("xyz");
		System.out.println("hashcode of z i.e = xyz : "+z.hashCode());
		
		//checking if strings sharing memory address with stringBuffer
		StringBuilder a = new StringBuilder("xyz");
		System.out.println("hashcode of a i.e = xyz : "+a.hashCode());
		StringBuilder b = new StringBuilder("xyz");
		System.out.println("hashcode of b i.e = xyz : "+b.hashCode());
		StringBuilder c= new StringBuilder("xyz");
		System.out.println("hashcode of c i.e = xyz : "+c.hashCode());
		
		/*  StringBuilder               StringBuffer
		 * -------------------------------------------
		 *  Mutable             |        Mutable
		 *  Version 1.0         |        Version 1.5
		 *  more efficient      |       less efficient
		 * */
		
		//checking efficiency of string builder
		long startTime=System.currentTimeMillis();
		StringBuffer k = new StringBuffer("xyz");
		for(int i=0; i<10000; i++)
		{
			k.append("DEF");
		}
		System.out.println("Time taken by string buffer:"+(System.currentTimeMillis()-startTime));
		//checking efficiency of string buffer
		startTime=System.currentTimeMillis();
		StringBuilder l = new StringBuilder("xyz");
		for(int i=0; i<10000; i++)
		{
			l.append("DEF");
		}
		System.out.println("Time taken by string builder:"+(System.currentTimeMillis()-startTime));
		//so we can come toa conclusion that string builder should be used instead of buffer which is outdated
	}

}
