package com.nabeel.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.nabeel.product.Model.Product;

//SpringBootTest
class ProductApplicationTests {

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





}
