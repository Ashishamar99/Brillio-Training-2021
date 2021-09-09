package com.brillio.springbootdemo;

import org.junit.Assert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RestExampleApplicationTests {

	@Autowired
	MyRestController controller;
	CrudController crudController;

	@Test
	@Order(1)
	public void testDTOAvailableOrNot(){
		try{
			StudentDTO studentDTO = new StudentDTO();
		} catch (Exception e){
			Assert.fail();
		}
	}

	//2nd Test Case.
	@Test
	@Order(2)
	public void testDTOAvailableOrNot1(){
		try{

			StudentDTO studentDTO = new StudentDTO();
			studentDTO.getAddress();
			studentDTO.getDob();

		} catch (Exception e){
			Assert.fail();
		}
	}

	@Test
	@Order(3)
	public void testController1(){
		try{

			List<StudentDTO> list = controller.getStudents();
			if(list == null) throw new Exception();

		} catch (Exception e){
			Assert.fail();
		}
	}

	@Test
	@Order(4)
	public void testController2(){
		try{

			List<StudentDTO> list = controller.getStudents();
			assertNotNull(list);

		} catch (Exception e){
			Assert.fail();
		}
	}

	@Test
	@Order(5)
	public void testController3() {
		try {
			Optional<StudentDTO> list= controller.getAnyStudent("5000");
			assertEquals(list, Optional.empty());
		} catch (Exception e) {
			fail();
		}
	}

}