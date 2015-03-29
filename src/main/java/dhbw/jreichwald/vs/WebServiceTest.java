package dhbw.jreichwald.vs;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Implementation of the Web Service Interface.
 * Uses SOAP1.2 - Binding to interoperate with C# nicely.
 * @author Prof. Dr. Julian Reichwald <julian.reichwald@dhbw-mannheim.de>
 *
 */
@WebService(endpointInterface="dhbw.jreichwald.vs.IWebServiceTest")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class WebServiceTest  implements IWebServiceTest {

	private Logger _log = LogManager.getLogger(WebServiceTest.class);
	
	@Override
	public AddResponse add(AddMessage msg) {
		_log.debug("Request received");
		AddResponse response = new AddResponse(); 
		response.setErgebnis(msg.getA() + msg.getB());
		_log.debug("Sending response ....");
		return response; 
	}
}
