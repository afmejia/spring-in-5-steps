package org.afmejia.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	@Autowired
	JdbcConnection jdbConnection;

	public JdbcConnection getJdbConnection() {
		return jdbConnection;
	}

	public void setJdbConnection(JdbcConnection jdbConnection) {
		this.jdbConnection = jdbConnection;
	}
}
