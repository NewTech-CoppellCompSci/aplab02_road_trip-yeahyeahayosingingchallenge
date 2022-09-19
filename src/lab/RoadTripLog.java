package lab;

public class RoadTripLog {
////instance variables (parameters)
	
	
	private String stop;
	private double Fuel;
	private double Distance;
	private double MPG;
	

	public RoadTripLog(String string) {
		
		//stop  equals to string
		
		stop = string;
			}

	public void addDistance(double d) {
		
		//distance = distance and d
		
		Distance = Distance + d;
		
		
	}

	public void addFuel(double d) {
		
		Fuel = Fuel+d;
		
	}
	
	public String toString(){
		//ToString
		return "Trip: " +stop+ "\n" + "Distance : "+Distance+"\n"+ "Fuel Used : "+Fuel+"\nMPG : "+MPG ;
		
	}

	public double getTotalDistance() {
		// return
		return Distance;
	}

	public double getTotalFuel() {
		// return
		return Fuel;
	}

	public double getMPG() {
		
		MPG = Distance / Fuel;
		// return
		return MPG;
	}
	
	

}

