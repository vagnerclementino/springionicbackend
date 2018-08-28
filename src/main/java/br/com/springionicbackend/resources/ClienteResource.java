package br.com.springionicbackend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springionicbackend.domains.Cliente;
import br.com.springionicbackend.services.ClienteService;

@RestController
@RequestMapping(value="clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping(value="/{id}")
	ResponseEntity<?> find(@PathVariable Long id){
		 Cliente cliente = service.find(id);
		return ResponseEntity
				.ok()
				.body(cliente);
		
	}

	

}
