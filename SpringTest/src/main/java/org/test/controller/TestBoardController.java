package org.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller // url분기와 jsp.연동 담당
@Log4j2
@RequestMapping("/testboard/*")
@AllArgsConstructor
public class TestBoardController {
	
	//리스트와 CRUD담당하는 분기 설정(url)
	

}
