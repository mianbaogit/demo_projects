
package samples.quickstart.service.ws;

import org.apache.axiom.om.OMElement;

import javax.xml.stream.XMLStreamException;


public class SimpleService {

	/**
	 * The echo method which will be exposed as the 
	 * echo operation of the web service
	 */
	public String echo(String value) {
		return value;
	}
}