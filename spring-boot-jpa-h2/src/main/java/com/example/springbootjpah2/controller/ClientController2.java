package com.example.springbootjpah2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootjpah2.dao.ClientRepo;
import com.example.springbootjpah2.model.Client;

@RestController
public class ClientController2 {
	
	@Autowired
	ClientRepo clientRepo;
	
	@PostMapping(path = "/client",consumes = "application/xml")
	public Client addClient(@RequestBody Client client)
	{
		return clientRepo.save(client);
	}
	
	@DeleteMapping("/client/{id}")
	public Optional<Client> deleteClient(@PathVariable int id)
	{
		Optional<Client> client = clientRepo.findById(id);
		clientRepo.deleteById(id);
		return client;
	}
	
	@PutMapping("/client")
	public Client updateClient(@RequestBody Client client)
	{
		return clientRepo.save(client);
	}
}
