package dhbw.jreichwald.vs;

import javax.xml.bind.annotation.XmlType;

/**
 * Output Message (Response) for the Add Operation 
 * @author Prof. Dr. Julian Reichwald <julian.reichwald@dhbw-mannheim.de>
 *
 */

@XmlType(name="AddResponseMessage")
public class AddResponse {

	private double ergebnis;

	public double getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(double ergebnis) {
		this.ergebnis = ergebnis;
	} 	
}
