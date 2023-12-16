package com.example.springbootjpah2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootjpah2.dao.ClientRepo;
import com.example.springbootjpah2.model.Client;

@Controller
public class ClientController {
	
	@Autowired
	ClientRepo clientRepo;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addClient")
	public String addClient(Client client)
	{
		clientRepo.save(client);
		return "home.jsp";
	}
	
	@RequestMapping("/getClient")
	public ModelAndView getClient(@RequestParam int clientId)
	{
		ModelAndView mv=new ModelAndView();
		Client client = clientRepo.findById(clientId).orElse(new Client());
		mv.setViewName("getClient.jsp");
		mv.addObject("client", client);
		return mv;
	}
	
	@RequestMapping("/getClientsByTech")
	public String getClientsByTech(@RequestParam String clientTech,Model model)
	{
		List<Client> findByClientTech = clientRepo.findByClientTech(clientTech);
		model.addAttribute("findByClientTech", findByClientTech);
		return "getClientsByTech.jsp";		
	}
	
	@RequestMapping("/getClientIdBetween")
	public String getClientIdBetween(@RequestParam("clientId1") int clientId1,@RequestParam("clientId2") int clientId2,Model model)
	{
		List<Client> getClientIdBetween= clientRepo.findByClientIdBetween(clientId1,clientId2);
		model.addAttribute("getClientIdBetween", getClientIdBetween);
		return "home.jsp";		
	}
	
	@RequestMapping("/jpql-native-query")
	public ModelAndView getClientsBySortedTech()
	{
		List<Client> clientsBySortedName = clientRepo.getClientsBySortedName("SQL",Sort.by("clientName").descending());
		Client clientByNameAndTech = clientRepo.getClientByNameAndTech("Kasthuri", "Java");
		Client clientById = clientRepo.getClientById(1001);
		Client clientByIdAndTech = clientRepo.getClientByIdAndTech(1003,"Selenium");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("jpql-native-query.jsp");
		mv.addObject("clientsBySortedName", clientsBySortedName);
		mv.addObject("clientByNameAndTech",clientByNameAndTech);
		mv.addObject("clientById", clientById);
		mv.addObject("clientByIdAndTech", clientByIdAndTech);
		return mv;
	}
	
	@RequestMapping(path = "/clients",produces ="application/xml")
	@ResponseBody
	public Iterable<Client> getClients()
	{
		return clientRepo.findAll();
	}
	
	@RequestMapping(path = "/client/{id}")
	@ResponseBody
	public Optional<Client> getClientById(@PathVariable int id)
	{
		return clientRepo.findById(id);
	}
}
