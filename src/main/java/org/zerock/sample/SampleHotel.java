package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component // 스프링 import org.springframework.stereotype.Component;
@ToString  // import lombok.ToString;
@Getter   // import lombok.Getter;
//@AllArgsConstructor // 모든 필드값을 이용하여 생성자 주입
@RequiredArgsConstructor //@NonNull만 생성자로 넣음
public class SampleHotel {
	// 묵시적 자동주입 : 
	// 스프링의 의존성 주입은 생성자 주입과 세터 주입을 자주 사용한다
	// 생성자 주입은 lombok이 알아서 파라미터를 만들어줌
	// 생성자 주입의 경우 객체 생성시 의존성 주입이 필요하므로 좀 더 엄격학 ㅔ의존성 주입을 체크한다
	// 세터주입은 값을 저장할시 자동으로 객체를 생성해줌. @Setter(onMethod_ = @Autowired)
	
	@NonNull
	private Chef chef; // 필드
	
	
	private Restaurant restaurant;
	
	
	private String name;
	
}
