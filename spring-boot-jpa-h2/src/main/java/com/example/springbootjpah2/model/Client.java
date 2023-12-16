package com.example.springbootjpah2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Client {
	
	@Id
	private int clientId;
	private String clientName;
	private String clientTech;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientTech() {
		return clientTech;
	}
	public void setClientTech(String clientTech) {
		this.clientTech = clientTech;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", clientTech=" + clientTech + "]";
	}
}
