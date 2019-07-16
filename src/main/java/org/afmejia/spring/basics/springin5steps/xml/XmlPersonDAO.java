package org.afmejia.spring.basics.springin5steps.xml;

public class XmlPersonDAO {

	XmlJdbcConnection xmlJdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbConnection) {
		this.xmlJdbcConnection = jdbConnection;
	}
}
