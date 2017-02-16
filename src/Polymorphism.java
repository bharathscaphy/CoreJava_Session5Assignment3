
public class Polymorphism {
	public static void main(String[] args)
	{
		Area a=new Area(15,4);
		Area b=new Area(12);
		float rec = a.getArea();
		float sq = b.getArea();
		System.out.println("Area of a Rectangle : "+rec);
		System.out.println("Area of a Square : "+sq);
	}
}
