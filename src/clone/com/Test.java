package clone.com;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat c = new Cat(10);
		Dog d = new Dog(c,20);
		
		System.out.println(d.c.j+"..."+d.i);
		
		Dog d1 = (Dog) d.Clone();
		d1.c.j=40;
		d1.i=30;
		
		System.out.println(d.c.j+"...."+d.i);


	}

}
