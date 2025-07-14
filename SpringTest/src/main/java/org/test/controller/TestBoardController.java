package org.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.test.domain.TestBoardVO;
import org.test.service.TestBoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller // url분기와 jsp.연동 담당
@Log4j2
@RequestMapping("/testboard/*")
@AllArgsConstructor
public class TestBoardController {
	
private TestBoardService service ; // 필드
	
	@GetMapping("/list") //http://192.168.111.104:80/board/list
	public void list(Model model) {
		//model은 스프링에서 데이터 관리용 객체 (예전에는 request영역 또는 session영역 사용했었음.)
		log.info("BoardController.list메서드 실행........");
		
		model.addAttribute("list", service.getList());
		//프론트에서 ${list} 로 활용한다. (for문 사용해야한다 )
	}
	
	
	@PostMapping("/register")
	public String register(TestBoardVO board, RedirectAttributes rttr) {
		//RedirectAttributes rttr 성공 후 이동할 경로를 기입한다
		
		log.info("BoardController.register메서드 실행........");
		service.register(board); // 객체 등록 성공?
		rttr.addFlashAttribute("result", board.getT_bno());
		// 1회용 값을 생성한다 -> 이름 : result (나중에 프론트에서 alert용으로 활용된다)
		return "redirect:/board/list"; // 성공시 다음 페이지
	}

	@GetMapping("/get") //http://192.168.111.104:80/board/get?bno=5
	public void get(@RequestParam("t_bno") Long t_bno, Model model) {
		// url을 통해서 넘어온 bno=5문자열을 long타입으로 받는다. /model 객체에 넣는다.
		log.info("BoardController.get메서드 실행........");
		model.addAttribute("board", service.get(t_bno));
	}
	
	@PostMapping("/modify")
	public String modify(TestBoardVO board, RedirectAttributes rttr) {
		log.info("BoardController.modify메서드 실행........");
		if(service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")//http://192.168.111.104:80/board/remove
	public String remove(@RequestParam("t_bno") Long t_bno, RedirectAttributes rttr) {
		log.info("BoardController.remove메서드 실행........");
		if(service.remove(t_bno)) {
			rttr.addFlashAttribute("result","success");
		}
		return "redirect:/board/list"; // 처리후 이동 페이지
	}
}
