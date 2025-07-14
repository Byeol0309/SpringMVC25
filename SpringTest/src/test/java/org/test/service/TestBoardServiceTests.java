package org.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.test.domain.TestBoardVO;
import org.test.mapper.TestBoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class TestBoardServiceTests {

	@Setter(onMethod_= @Autowired)
	private TestBoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board->log.info(board));
	}
		@Test
		public void testGetListXML() {
		
		mapper.getList2().forEach(board -> log.info(board) );
		
	}
		
		@Test
		public void testInsert() {
			
			TestBoardVO board = new TestBoardVO(); 
			board.setT_title("insert테스트");
			board.setT_content("오류없기를");
			board.setT_writer("김샛별");
			
			mapper.insert(board);
			
			log.info(board);
			
		}
		
		@Test
		public void testInsertSelectKey() {
			
			TestBoardVO board = new TestBoardVO();
			board.setT_title("게시판번호테스트");
			board.setT_content("번호내용 ");
			board.setT_writer("샛별");
			
			mapper.insertSelectKey(board);
			
			log.info(board);
			log.info("내가만든 게시물의 번호는 : " + board.getT_bno());
			
		}
		
		@Test
		public void testRead() {
			
			TestBoardVO board = mapper.read(1L); 
			log.info(board);
			
		}
		
		@Test
		public void testDelete() {
			
			int count = mapper.delete(3L);
			log.info("삭제된 갯수 출력 : " + count + "건");
		}
		
		@Test
		public void testUpdate() {
			
			TestBoardVO board = new TestBoardVO();
			board.setT_bno(5L);
			board.setT_title("수정된 제목");
			board.setT_content("수정된 내용");
			board.setT_writer("김수정");
			
			int count = mapper.update(board);
			log.info("수정된 갯수 : " + count + "건");
			log.info("수정된 객체 출력 :" + board);
			
			
			
			
			
		}
	
}
