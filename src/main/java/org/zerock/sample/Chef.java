package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component // 스프링이 의존성 처리해달라는 
@Data		// import lombok.Data; DTO처리 (게터/세터. toString, equals등 ..)
public class Chef {

		private String name;
		private int age;
}
