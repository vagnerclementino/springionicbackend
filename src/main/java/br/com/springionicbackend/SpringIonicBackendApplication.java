package br.com.springionicbackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import br.com.springionicbackend.domains.Categoria;
import br.com.springionicbackend.domains.Cidade;
import br.com.springionicbackend.domains.Cliente;
import br.com.springionicbackend.domains.Endereco;
import br.com.springionicbackend.domains.Estado;
import br.com.springionicbackend.domains.Produto;
import br.com.springionicbackend.domains.enums.TipoCliente;
import br.com.springionicbackend.repositories.CategoriaRepository;
import br.com.springionicbackend.repositories.CidadeRepository;
import br.com.springionicbackend.repositories.ClienteRepository;
import br.com.springionicbackend.repositories.EnderecoRepository;
import br.com.springionicbackend.repositories.EstadoRepository;
import br.com.springionicbackend.repositories.ProdutoRepository;

@SpringBootApplication
public class SpringIonicBackendApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIonicBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		Estado est1 = new Estado(null, "São Paulo");
		Estado est2 = new Estado(null, "Minas Gerais");
		
		Cidade cid1 = new Cidade(null, "Uberlândia", est2);
		Cidade cid2 = new Cidade(null, "São Paulo", est1);
		Cidade cid3 = new Cidade(null, "Campinas", est1);
		
		est1.getCidades().addAll(Arrays.asList(cid2,cid3));
		est2.getCidades().addAll(Arrays.asList(cid1));
		
		Cliente cli1 =  new Cliente(null, "Maria Silva", "maria.silva@gmail.com", "11111111111", TipoCliente.PESSOAFISICA);
		
 		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393")); 
 		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, cid1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, cid2);		
		
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));		
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(cid1,cid2,cid3));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
		
		
		
	}
}
