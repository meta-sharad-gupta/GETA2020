
public class AreaOperations {

	/*
	 * Used for Finding Area of Triangle
	 * @param base :it is for getting base
	 * @param height : it is for getting height 
	 * @return (base*height)/2 :it is for returning area
	 */
	public double areaOfTriangle(double width,double height){
		return (width*height)/2;
	}
	/*
	 * Used for Finding Area of Rectangle
	 * @param base : it is for getting base
	 * @param height : it is for getting height
	 * @return base*height : it is for returning Area
	 */
	public double areaOfRectangle(double width,double height){
		return (width*height);
	}
	/*
	 * Used for Finding Area of Square
	 * @param side : for getting side
	 * @return side*side : for returning Area
	 */
	public double areaOfSquare(double width){
		return (width*width);
	}
	/*
	 * Used for Finding Area of Circle
	 * @param radius : for getting radius
	 * @return PI*radius*radius : for returning Area
	 */
	public double areaOfCircle(double radius){
		return (Math.PI*radius*radius);
	}

}
