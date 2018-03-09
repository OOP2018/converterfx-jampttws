package converter;

public enum Length {
	Meter(1.0),
	Centimeter(0.0100),
	Kilometer(1000.0), 
	Mile(1609.344), 
	Foot(0.30480), 
	Wa(2.0),
	AU(149597870700.0);

	// attributes of the enum members
	private final double value;

	// constructor must be private
	private Length(double value) { this.value = value; }
	// methods just like in a class
	public double getValue() { return this.value; }


}
