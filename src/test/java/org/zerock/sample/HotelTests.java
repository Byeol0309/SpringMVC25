package org.zerock.sample;

import static org.junit.Assert.assertNotNull;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class) //메서드 단위로 테스트용 코드
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // 테스트시 사용될 spring 코드
@Log4j2 //Log4j가 취약해서 Log4j2로 교체
public class HotelTests {

	 @Setter(onMethod_ = @Autowired)
	 private SampleHotel hotel; // new SampleHotel(chef)
	 
	 @Test //메서드 단위로 테스트
	 public void testExist() {
		 assertNotNull(hotel);
		 log.info(hotel);
		 log.info("-------------------");
		 log.info(hotel.getChef());
		 
		 //ck.sample.HotelTests(testExist26) - SampleHotel(chef=Chef(name=null, age=0))
		// INFO  org.zerock.sample.HotelTests(testExist27) - -------------------
	    //INFO  org.zerock.sample.HotelTests(testExist28) - Chef(name=null, age=0)
	 }
	
}
