package dhbw.jreichwald.vs;

import javax.xml.ws.Endpoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main class
 * @author Prof. Dr. Julian Reichwald <julian.reichwald@dhbw-mannheim.de>
 *
 */
public class Main {
	
	private static Logger _log = LogManager.getLogger(Main.class);
	
	/**
	 * Main method just starts a web server on the specified IP/Port 
	 * Combination and exposes the web service.
	 * @param args
	 */
	public static void main(String[] args) {
		String endpoint = "http://localhost:8888/ws"; 
		Endpoint.publish(endpoint, new WebServiceTest());
		_log.debug("Web Service exposed - server up and running.");
	}
}
