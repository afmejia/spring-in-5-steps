package org.afmejia.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	@Autowired
	ComponentJdbcConnection jdbConnection;

	public ComponentJdbcConnection getJdbConnection() {
		return jdbConnection;
	}

	public void setComponentJdbConnection(ComponentJdbcConnection jdbConnection) {
		this.jdbConnection = jdbConnection;
	}
}
