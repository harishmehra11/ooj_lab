package labPrograms;
abstract class Shape {
int dim1;
int dim2;
Shape(int a, int b) {
dim1 = a;
dim2 = b;
}

abstract double area();
}
class Rectangle extends Shape {
Rectangle(int a, int b) {
super(a, b);
}

double area() {
System.out.println("Inside Area for Rectangle.");
return dim1 * dim2;
}
}
class Triangle extends Shape {
Triangle(int a, int b) {
super(a, b);
}

double area() {
System.out.println("Inside Area for Triangle.");
return dim1 * dim2 / 2;
}
}
class Circle extends Shape{
	Circle(int a,int b){
		super(a,b);
	}
	double area() {
		System.out.println("Inside area of Circle");
		return 3.14*dim1*dim1;
	}
}

class AbstractAreas {
public static void main(String args[]) {

Rectangle r = new Rectangle(9, 5);
Triangle t = new Triangle(10, 8);
Shape shapef; 
shapef = r;
System.out.println("Area is " + shapef.area());
shapef = t;
System.out.println("Area is " + shapef.area());
}
}
