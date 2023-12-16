package com.example.springdatarestjpah2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springdatarestjpah2.model.Client;

@RepositoryRestResource(collectionResourceRel = "clients",path = "clients")
public interface ClientRepository extends JpaRepository<Client,Integer>{

}
