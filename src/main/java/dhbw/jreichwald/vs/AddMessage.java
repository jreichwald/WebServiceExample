package dhbw.jreichwald.vs;

import javax.xml.bind.annotation.XmlType;

/**
 * Input Message (Request) for the Add Operation
 * @author Prof. Dr. Julian Reichwald <julian.reichwald@dhbw-mannheim.de>
 *
 */

@XmlType(name="AddRequestMessage")
public class AddMessage {

	/**
	 * First Operand
	 */
	private double a; 
	
	/**
	 * Second Operand
	 */
	private double b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	} 
}
