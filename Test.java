1]: Platform Independence :
	the program which is written once can be executed in other os platforms . no need to rewrite the program again in that platform.
	means the program which is written useing windows os that can be executed in the mac,linux,unix os.no need to rewrite the program.
	platform is nothing but the of processor which the program or proccess being excuted the program which is written once can be executed in the
	different proccessor called platform independence "WRITE ONCE RUN ANYWHERE".JAVA IS A PLATFORM INDEPENDENT LANGUAGE beacuse compiled .Class file can be
	executed in the different platform no need to recompile the program.

2]:DATA TYPE:

			the type of data which can be stored in an variable can defined by the datatypes .
			
			TWO TYPES
			1:PRIMITIVE
			2:NON-PRIMITIVE
1:primitive data types which starts with an Smaller case there are 8 primitive types such that 

		byte,short,int,long,float,double,char,boolean.
		
2:non primitive types are wich the datatype which Starts which an upper case .there are n number of	non primitive datatype.
	
System
String etc.

3}Class: Class is an blueprint of an object .which is not exist in this realworld .
class members:

 * Variables:variables are the containers which is used to store the data it can be used later during the program.

	int a=10;
	
 *Methods: methods are also called as functions which can be used for the reuseability of the code. which can helpful to reduce the number of lins of code
		methods can accept the parameters.
		
		public void add()
		{
		}
		
 *blocks :blocks can be static or non static which is used to witre the statements in it.
 
 *Constructors: it is the special type of methode which the calss and constructor name will be same .without the return type.it will be executed when the object is 
		 created.
		 
4]: 
import java.util.Scanner;
Class Marks
{

	public int perct(int tt ,int rec)
	{
	 if(tt!=0)
	 {
	 int p=rec/tt*100;
	 return p;
	 
	 }
	
	
		public Static void main(String a[])
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter total");
		int tt=s.nextInt();
		System.out.println("enter gained");
		int rec=s.nextInt();
		int ref=perct(tt,rec);
		}


}

6]:main methode: public static void main(String[] a){

}

public is the access specifier which the file can be accessed anywher in the system java compiler will load that file .

static is the non access modifier which will allocate the memory in the compilation time.

void is the return type which will not return any value to the user .

main is the methode name wher the execution will began jvm will search for the main methode for the execution purpose.

String is the non primitive datatype which will store the data which are passed in the command line in an String array.


7]:reverse a number:

Class Reverse
{
	int n=123;
	int rev=0;
	
	while(n!=0)
	{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	
	}
	
	System.out.println("reverse is "+rev);

}

8}: Class Polindrum
{
	int n=123;
	
	int temp=n;
	int rev=0;
	
	
	while(n!=0)
	{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	
	}
	
	if(temp==rev)
	{
		
		System.out.println("its polindrum");
		
	}
	else
	{
		
		System.out.println("its not polindrum");
		
		
	}	
	
}

Class Armstrong 
{
int n=345;
int temp=n;

while(n!=0)
	{
	rem=n%10;
	int arm += math.pow(rem,3)
	n=n/10;
	
	}	
	if(n==arm)
	{
		
		System.out.println("its armstrong" +temp);
		
	}
	else
	{
		
		System.out.println("its not armstrong"+temp);
		
		
	}		
}

5}:remove duplicate element

Class Duplicate
{
	public static void main(String a[])
	{
	
	int[] values={34,78,90,3,34,11,53,15,78,91,8,4,67,11};
	
	int temp[]=new temp[n];
	
		for(int i=0;i<values.length;i++)
		{
			for(int j=1;j<values.length;j++)
			{
				for(int k=0;k<temp.length;k++)
				{
					
				if(a[i]==a[j] )
				{
					temp[k]=a[i];
					
				}
				
				
				
			}
			
			
	}}	
	
	
	for(int in=0;in<temp.length;in++)
	{
		System.out.println(temp[in]);
	}
}
}

8}:

import java.util.*;
class Hours
{
	public static void main(String[] a)
	{
		float hour,seconds;
		
		Scanner s=new Scanner(System.in);
		hour=s.nextInt();
		seconds=hour*3600;
		
		System.out.println("hours in seconds " +seconds);		
		
	}
	
	
}















		 

	
	