package com.example.springbootjpah2.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.springbootjpah2.model.Client;

public interface ClientRepo extends CrudRepository<Client, Integer>{
	
	List<Client> findByClientTech(String tech);
	
	List<Client> findByClientIdBetween(int start,int end);
	
//	JPQL named query
	
	@Query(value = "from Client where clientTech=:clientTech")
	List<Client> getClientsBySortedName(@Param("clientTech") String clienttech,Sort sort);
	
//	JPQL Indexed query
	
	@Query("from Client where clientName=?1 and clientTech=?2")
	Client getClientByNameAndTech(String clientname,String clienttech);
	
//	Native named query
	
	@Query(value = "Select * from client where client_id=:clientId",nativeQuery = true)
	Client getClientById(@Param("clientId") int clientid);
	
//	Native Indexed query
	
	@Query(value = "select * from client where client_id=?1 and client_tech=?2",nativeQuery = true)
	Client getClientByIdAndTech(int id,String tech);

}
