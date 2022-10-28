1 : JRE : Java RunTime Environment which is present inside the JDK contains the set of libraries and java virtual machine to execute the byte code .

	JDK: JAVA DEVELOPMENT KIT : which contains the JRE and JVM which is used to develop and execute the java program.
	
	JVM : JAVA VIRTUAL MACHINE : which is not physically exist .present inside the JRE which will perform the functions such as:
			* loads the byte code.
			*verifies the byte code
			*interpret the byte code line by line.
			*executes the byte code .
			
2:  i]. Class : class is the blueprint of an object .which will contains states and beheviours .

	Object: Object is the real time entity .which is used to invoke non static members of the class .by the help of Object we can create 
			Multiple copies of an class.
			
	static : static is the predefined keyword which can be used with variables,methods and blocks we can directly call the static members with the help of
			class name inside main method.without any object reference.
			
	public : it is the access specifier we can call the public members anywher.there is no such access restrictrictions.where everyone can access .
	
	private : it is also a access specifier where the members which are declared useing private keyword can be accessible within the same class .
				we cannot access outside the class . we cannot inherit the private members.
				
  ii] Public static void main(String a[]):
			public is the access specifier which the file can be accessed anywher in the system java compiler will load that file .

			static is the non access modifier which will allocate the memory in the compilation time.

			void is the return type which will not return any value to the user .

			main is the methode name wher the execution will began jvm will search for the main methode for the execution purpose.

			String is the non primitive datatype which will store the data which are passed in the command line in an String array.  
		

	iii]System.out.println(); it will prints the output in the console .for the user 

3]:Array : we can store more than one similar type of elements into the single variable with the help of array . 

			int arr[]={1,2,3,4};

4]: class Program
	{
		 static int num[] = {23,45,56,67,8,12,3,5,7,9,102,34,4,5};
		
		static int count=0;
		static int count1=0;
		
	static boolean checkForPrime()
		{
		boolean isItPrime = true;
		for (int i = 0; i<num.length; i++)
	{		

	if(num[i] <= 1) 
	{
	isItPrime = false;

	return isItPrime;
	}
	else
	{
	for (int j = 2; j<= num[i]/2; j++) 
	{	
	if ((num[j] % 2) == 0)
	{
	isItPrime = false;

	break;
	}
	}

	return isItPrime;
	}
	}
		}

	static void oddEven(){
		for (int i = 0; i<num.length; i++){
			
		if(num[i]%2==0)
		{
			count++;
			System.out.println("even number is"+num[i]+""+count);
			
		}
		else{
			count1++;
			System.out.println("odd number is"+num[i]+""+count1);
			
		}
		}
		
	}
	
	static void size()
	{
		int len=num.length;
		System.out.println("size is"+len);
		
		
	}
	
	public static void main(String[] a)
	{
		checkForPrime();
		checkForPrime();
		
		boolean isItPrime = checkForPrime();

		if (isItPrime)
		{
		System.out.println(" is a prime number.");
		}
		else
		{ 
		System.out.println(" is not a prime number.");
		}
		oddEven();
		size();
		
	}
		}
		
	5]: the type of data which can be stored in an variable can defined by the datatypes .
			
			TWO TYPES
			1:PRIMITIVE
			2:NON-PRIMITIVE
1:primitive data types which starts with an Smaller case there are 8 primitive types such that 

		byte,short,int,long,float,double,char,boolean.
		
2:non primitive types are wich the datatype which Starts which an upper case .there are n number of	non primitive datatype.
	
System
String etc.

6]: Variables:variables are the containers which is used to store the data it can be used later during the program.

	int a=10;
	
	Local variables: which is declared inside the methods or functions;
	instance variables: which is declared outside the methods which is accessible inside whole class.
	
7]:Constructor: it is the special type of methode with same as class name but no return type.

	when the object is created constructor will be invoked.
	
	yes class can hav multiple constructors called constructor overloading with differnce in the parameters.
	
	i] default constructor: compiler will automatically create the constructor without any argument known as default constructor.
	
	 publuc ClassName()
	 {
		 
	 }
	 
	 ii]: parameterized constructor: user defined constructor haveing the different parameters wiil be inoked during the object creation.
	 
	 publuc ClassName(int a,int b)
	 {
		 this.int a=a;
		 this.int b=b;
		 
	 }
	 
8]
 java features:
1]robust
2.platform independence
3.automatic garbage collection
4.secure
5.multi threading
6.object oriented.


9]:platform independence nature gives WRITE ONCE RUN ANYWHERE NATURE means the program which is developed & compiled using one platform it can be executed in other 
	platform whitout any compilation.
	
10]: static members doesnot require the object reference to invoke they can be directly called with the help of class name inside the main methode.
	 compiler will allocate the memories for static members before execution of the main methode.
	 
11]:default constructor will be used during the object creation when the object is created constructor will be excuted .it is automatically created by the compiler.
	it will assign the default values of the datatype to the values .

12]:reverse a number

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		int rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=s.nextInt();
		
		while(n!=0)
		{
			 int rem=n%10;
			 rev=rev*10+rem;
			n=n/10;
			
			
		}
		System.out.println(rev);

	}

}

13]:factorial

public class Facto {	
	static int factorial(int n)
	{
		if(n!=0)
		{
			return n*factorial(n-1);
		}
			else
			{
				return 1 ;
			
		}
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		int n=s.nextInt();
		
		int fac=factorial(n);
		System.out.println(fac);
	

	}

}

14]: input : 234 out:9

import java.util.*;
public class Sum {

	public static void main(String[] args)
	{
		int summ=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=s.nextInt();
		
		while(n!=0)
		{
			 int rem=n%10;
			 summ=summ+rem;
			n=n/10;
			
			
		}
		System.out.println(summ);

	}

}


	
		













