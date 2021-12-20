package com;

public class Dog implements Cloneable{
	
	int i;
	Cat c;
	Dog(Cat c, int i){
		
		this.c=c;
		this.i=i;
		
	}
	
	public Object Clone() {
		Dog d = new Dog(c,i);
		
		
		return d;
		
	}

}
