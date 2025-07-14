package org.test.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TestBoardVO {
	// 객체용으로 vo는 읽기전용 속성이 강하게 만드는 객체(getter 위주로 셋팅)
		// dto는 게터/세터 모두 가지고 활용하는 객체
		
		private Long t_bno;
		private String t_title;
		private String t_content;
		private String t_writer;
		private Date t_regDate;
		private Date t_updateDate;
}
