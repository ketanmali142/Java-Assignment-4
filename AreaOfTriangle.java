package Assignment4;

public class AreaOfTriangle {
	private float a;
	private float b;
	private float c;
	private float area;
	private float peri;
	
	public AreaOfTriangle() {
		a=3;
		b=4;
		c=5;
				
	}
	public void area() {
		area=(float) (0.5*a*b);
	}
	public void perimeter() {
		peri=a+b+c;
	}
	public void display() {
		System.out.println("Area of Triangle is:"+area);
		System.out.println("perimeter of Triangle"+peri);
	}
	public static void main(String[] args) {
		AreaOfTriangle a1=new AreaOfTriangle();
		a1.area();
		a1.perimeter();
		a1.display();
		

	}

}
