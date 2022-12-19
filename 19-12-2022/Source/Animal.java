/*
	M. Navaneethakannan
	Practice session
	Date: 19.12.2022
	Program using default construction and parameter construction
*/
import java.util.*;
class Animal{
	String name;
	int age;
	float height;
	float weight;
	Animal(){
		name="Tiger";
		age=10;
		height=3f;
		weight=175f;
	}
Animal(String name, int age, float height, float weight)
{
	this.name=name;
	this.age=age;
	this.height=height;
	this.weight=weight;
}
public static void main(String... Args)
{
	Animal tiger=new Animal();
	Animal dog=new Animal("Dog",5,2f,95f);
	System.out.println("Name	: "+tiger.name);
	System.out.println("Age	:"+tiger.age);
	System.out.println("Height	:"+tiger.height+"feet");
	System.out.println("weight	:"+tiger.weight+"kgs");
	System.out.println();
	System.out.println("Name	: "+dog.name);
	System.out.println("age	:"+dog.age);
	System.out.println("height	: "+dog.height+"feet");
	System.out.println("Weight	:"+dog.weight +"kgs");
	
	
	
	
}
}
