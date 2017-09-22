import java.text.DecimalFormat;


public class Station{
	
	//attributes
	private String name;
	private int x;
	private int y;
	private int z;
	
	
	//constructor
	public Station(String name, int x, int y, int z) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}


	//computes the distance from this station to the origin
	public double getDistance(){		
		return Math.sqrt(Math.pow(x-0, 2) + Math.pow(y-0, 2) + Math.pow(z-0, 2));
	}
	
	
	//returns a string representation of this object
	public String toString(){
		DecimalFormat df = new DecimalFormat("###.00");
		return name + " at (" +x + ", " + y + ", " +z + ") is " + df.format(getDistance()) + " units away";
	}
	
}
