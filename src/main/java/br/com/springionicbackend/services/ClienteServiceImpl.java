package br.com.springionicbackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springionicbackend.domains.Cliente;
import br.com.springionicbackend.repositories.ClienteRepository;

@Service
public class 
ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente find(Long id) {
	    Optional<Cliente> clienteOptional = clienteRepository.findById(id);
	    
	    return clienteOptional
	    		.orElseThrow(() -> new ResourceNotFound("Não foi possível localizar o recurso " + 
	    														 Cliente.class.getName() + 
	    														 " com o id: " + 
	    														 id
	    										    )
	    				    );
	}

	

}
