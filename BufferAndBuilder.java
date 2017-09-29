package bb;
//Package is a grouping of related types providing access protection and name 
//buffer and builder(bb) is the package name
public class BufferAndBuilder {
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//BufferAndBuilder is class name
	public static void main(String[] args) {
////static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
						
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("Priya");
	//created String buffer with variable buffer
		System.out.println("It gives the output has:"+buffer);
		//here it prints the buffer value
		System.out.println("The length is:"+buffer.length());
		//here it prints the buffer length which is 5
		System.out.println("Capacity is:"+buffer.capacity());
		//here it prints the buffer capacity which is 16 default and is added to the string capacity
		//then it will be 21
		buffer.append("The student of Acadgild");
		//this is used to append the specified string with the string
		System.out.println("It gives the output has:"+buffer);
		System.out.println("The length is:"+buffer.length());//length will become 28
		System.out.println("Capacity is:"+buffer.capacity());
		//capacity will be 44
		buffer.append("It is an Organization");
		
		System.out.println("Capacity is:"+buffer.capacity()); 
		//capacity will be 90
		System.out.println(buffer);
		System.out.println("The length is:"+buffer.length());
		//length will be 4
		System.out.println("Capacity is:"+buffer.capacity());
		//here it shows like (44*2)+2=90 ie (initial capacity*2)+2
//this is how the append happens uses the capacity of string buffer or string builder		

//String builder and String buffer have same method but there is one difference between them.
//String buffer is synchronized that is thread is safe whenever we are working with thread we use String buffer		
	}

}
