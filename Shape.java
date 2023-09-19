
public abstract class Shape {
abstract double surface_area();
abstract double volume();
}

class Sphere extends Shape {
	private double Radius;
	public Sphere(double rad) {
		Radius = rad;
	}

public double volume() {
	double vol = (4/3)*3.14*Math.pow(Radius, 3);
	return vol;
}
public double surface_area() {
	double sa = 4*3.14*Math.pow(Radius, 2);
	return sa;
}
public String toString() {
	return "Surface Area of Sphere: " + surface_area() + "\nVolume of Sphere: " + volume();
}

}
class Cylinder extends Shape {
	private double Radius;
	private double height;
	public Cylinder(double rad, double h) {
		Radius = rad;
		height = h;
	}
	public double volume() {
		double vol = 3.14*Math.pow(Radius, 2)*height;
		return vol;
	}
	public double surface_area() {
		double sa = (2*3.14*Radius*height) + (2*3.14*Math.pow(Radius, 2));
		return sa;
	}
	public String toString() {
		return "Surface Area of Sphere: " + surface_area() + "\nVolume of Sphere: " + volume();
}
}
class Cone extends Shape {
	private double Radius;
	private double height;
	public Cone(double rad, double h) {
		Radius = rad;
		height = h;
	}
	public double volume() {
		double vol = (3.14*Math.pow(Radius, 2)*height)/3;
		return vol;
	}
	public double surface_area() {
		double sa = 3.14*Radius*(Radius + Math.sqrt((Math.pow(height, 2))+ (Math.pow(Radius, 2))));
		return sa;
	}
	public String toString() {
		return "Surface Area of Sphere: " + surface_area() + "\nVolume of Sphere: " + volume();
		
	}
}
