package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ClientController {

	@Autowired
	private WebClient client;
	
	@GetMapping(path="/bclient")
	public Flux<String> getAll(){

	return this.client.get().uri("http://localhost:7000/api/v1/donor").retrieve().bodyToFlux(String.class);
	}
	
	@GetMapping(path="/searchBygroup")
	public Flux<String> searchBygroup(@PathVariable("bloodgroup") String group){
		return this.client.get().uri("http://localhost:7000/api/v1/donor"+"/{bloodgroup}",group).retrieve().bodyToFlux(String.class);
	}
	
	@GetMapping(path="/searchBycode")
	public Flux<String> searchBycode(@PathVariable("areacode") int code){
		return this.client.get().uri("http://localhost:7000/api/v1/donor"+"/srch/{areacode}",code).retrieve().bodyToFlux(String.class);
	}
	@GetMapping(path="/searchBycampName")
	public Flux<String> searchBycamp(@PathVariable("campname")int x){
		return this.client.get().uri("http://localhost:7010/api/v1/donorcamp"+"/{campname}",x ).retrieve().bodyToFlux(String.class);
	}
}
