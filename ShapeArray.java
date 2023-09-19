
public class ShapeArray
{
	public static void main(String[]args) {
		Shape shapeArray[] = new Shape[3];
		shapeArray[0] = new Sphere(3);
		shapeArray[1] = new Cylinder(2,5);
		shapeArray[2] = new Cone(6,7);
		for (int i = 0; i<3; i++) {
			System.out.println(shapeArray[i]);
		}
	}
}