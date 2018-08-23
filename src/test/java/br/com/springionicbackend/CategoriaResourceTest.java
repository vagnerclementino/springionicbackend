package br.com.springionicbackend;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import br.com.springionicbackend.domains.Categoria;
import br.com.springionicbackend.repositories.CategoriaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringIonicBackendApplication.class)
@WebAppConfiguration
public class CategoriaResourceTest {
	
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));
	
	private MockMvc mockMvc;
    private Categoria categoria;


    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Autowired
	private WebApplicationContext webApplicationContext;
    

	@Before
	public void setUp() throws Exception {
		this.mockMvc = MockMvcBuilders
			          .webAppContextSetup(webApplicationContext)
			          .build();

        this.categoriaRepository.deleteAllInBatch();
        

        this.categoria = categoriaRepository.save(new Categoria(null, "Informática"));
      
	}
	
  @Test
    public void categoriaNotFound() throws Exception {
        mockMvc.perform(post("/categoria/-1/")
                .contentType(contentType))
                .andExpect(status().isNotFound());
    }

	@Test
	public void testListar() throws Exception{
		fail("Not yet implemented");
	}

	@Test
	public void testListaCategoria() throws Exception {
		
		 mockMvc.perform(get("/categoria/" + this.categoria.getId()))
         .andExpect(status().isOk())
         .andExpect(content().contentType(contentType))
         .andExpect(jsonPath("$.id", is(this.categoria.getId())))
         .andExpect(jsonPath("$.nome", is("http://bookmark.com/1/" + this.categoria.getNome())));
         //.andExpect(jsonPath("$.description", is("A description")));
	}

}

