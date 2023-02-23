package com.nabeel.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.BDDMockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.nabeel.product.Controller.ProductController;
import com.nabeel.product.Model.Product;
import com.nabeel.product.Repository.IProductRepository;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@AutoConfigureJsonTesters
@SpringBootTest
@AutoConfigureMockMvc
class ProductApplicationTests {

	@Autowired
    private MockMvc mvc;

    @Mock
    private IProductRepository productRepo;

	@InjectMocks
	private ProductController productController;

	private JacksonTester<Product> jsonProduct;
	private JacksonTester<List<Product>> jsonProducts;

	@Test
	void contextLoads() {
	}


	@Test
	void getAndSetID(){
		Product cut = new Product();
		Long myId = 1L;
		cut.setId(myId);
		assertEquals(myId, cut.getId());
	}

	@Test
	void getAndSetProductName(){
		Product cut = new Product();
		String myName = "table";
		cut.setName(myName);
		assertEquals(myName, cut.getName());
	}
	@Test
	void getAndSetProductlongDiscription(){
		Product cut = new Product();
		String mylongDescription = "table";
		cut.setLongDiscription(mylongDescription);
		assertEquals(mylongDescription, cut.getLongDiscription());
	}

	@Test
	void getAndSetProductShortDiscription(){
		Product cut = new Product();
		String myShortDiscription = "table";
		cut.setShortDiscription(myShortDiscription);
		assertEquals(myShortDiscription, cut.getShortDiscription());
	}
	@Test
	void getAndSetProductimageLink(){
		Product cut = new Product();
		String myimageLink = "imagelink";
		cut.setImageLink(myimageLink);
		assertEquals(myimageLink, cut.getImageLink());
	}
@Test
	void getAndSetPrice(){
		Product cut = new Product();
		Long myPrice = 134L;
		cut.setPrice(myPrice);
		assertEquals(myPrice, cut.getPrice());
	}

	@Test
	void getAllData() throws Exception{
		Product cut = new Product(1L,"hello","short desc","long desc","image",2300l);
		Product cut2 = new Product(1L,"hello","short desc","long desc","image",2300l);
		given(productRepo.findAll()).willReturn(List.of(cut, cut2));
		mvc.perform(get("/product/getproduct")
		.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk());
	}




}
