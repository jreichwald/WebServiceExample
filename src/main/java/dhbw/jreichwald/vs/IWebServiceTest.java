package dhbw.jreichwald.vs;

import javax.jws.WebService;

/**
 * Declaration of the Service Interface
 * @author Prof. Dr. Julian Reichwald <julian.reichwald@dhbw-mannheim.de>
 *
 */

@WebService
public interface IWebServiceTest {

	/**
	 * Add to double values 
	 * @param a first operand 
	 * @param b second operand 
	 * @return addition of a and b 
	 */
	public AddResponse add(AddMessage msg);
	
}
