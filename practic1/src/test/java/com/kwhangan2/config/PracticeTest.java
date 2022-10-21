package com.kwhangan2.config;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class PracticeTest {

	 @Setter(onMethod_ = {@Autowired})
	   private Person person;
	   
	   @Test
	   public void testExist() {
	      
	      assertNotNull(person);
	      
	      person.setName("홍길동");
	      person.setAge(20);
	      
	      person.getPet().setAge(5);
	      person.getPet().setName("해피");
	      
	      String pname=person.getName();
	      int page=person.getAge();
	      
	      String aname = person.getPet().getName();
	      int apage=  person.getPet().getAge();
	      
	      log.info(person);
	      log.info("-----------------------------------------------------------------");
	      log.info(person.getPet());
	      log.info(page+"살 인  " +pname+"이  "+apage+"   살인  "+aname+"를 키운다 ㅋ");
	      
	   }
}
	
