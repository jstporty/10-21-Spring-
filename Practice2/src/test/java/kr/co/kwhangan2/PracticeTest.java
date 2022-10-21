package kr.co.kwhangan2;
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
@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class PracticeTest {

	 @Setter(onMethod_ = {@Autowired})
	   private Person person;
	   
	 
	 @Setter(onMethod_ = {@Autowired})
	   private Pet pet;
	 
	   @Test
	   public void testExist() {
	      
	      assertNotNull(person);
	      
	      pet.setAge(5);
	      pet.setName("해피");
	      person.setName("홍길동");
	      person.setAge(20);
	      
	     person.setPet(pet);
	      
	      
	      
	  
	      
//	      log.info(person.getPet().getName());
//	      log.info("-----------------------------------------------------------------");
//	      log.info(person.getPet());
	      log.info( person.getAge() + "살 인  " +person.getName()+"이  "+ pet.getAge()+"   살인  "+pet.getName()+"를 키운다 ㅋ");
	      
	   }
}
	
