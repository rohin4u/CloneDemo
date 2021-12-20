package clone.com;

public class Dog implements Cloneable{
	
	int i;
	Cat c;
	Dog(Cat c, int i){
		
		this.c=c;
		this.i=i;
		
	}
	
	public Object Clone() throws CloneNotSupportedException {
		Cat c = new Cat(10);
		
		Dog d1 = new Dog(c,20);
		
		
		return d1;
		
	}

}
