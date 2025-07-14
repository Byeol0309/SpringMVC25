package org.test.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.test.domain.TestBoardVO;
import org.test.mapper.TestBoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Service
@AllArgsConstructor
@Log4j2
public class TestBoardServiceImpl implements TestBoardService{

		private TestBoardMapper mapper; // db쿼리용 객체(CRUD)
		
		@Override
		public void register(TestBoardVO board) {
			// 객체가 넘어오면 메퍼를 이용해서 데이터베이스에 등록함
			
			log.info("TestBoardServiceImpl.register메서드 실행.....");
			
			mapper.insertSelectKey(board);
			log.info("정상등록 후 리스트 출력테스트......");
			mapper.getList2();
		}
		
		@Override
		public TestBoardVO get(Long t_bno) {
			// 게시물의 번호가 들어가면 메퍼의 select문이 동작해야 한다.
			log.info("BoardServiceImpl.get메서드 실행.....");
			
			return mapper.read(t_bno);
			
		}
		
		@Override
		public boolean modify(TestBoardVO board) {
			// 프론트에서 객체가 넘어오면 매퍼를 통해서 update 쿼리가 실행된다.
			log.info("BoardServiceImpl.modify메서드 실행.....");
			return mapper.update(board) == 1;
		}
		
		@Override
		public boolean remove(Long t_bno) {
			// 프론트에서 번호가 넘어오면 매퍼를 통해서 delete 쿼리기 실행된다.
			
			log.info("BoardServiceImpl.remove메서드 실행.....");
			return mapper.delete(t_bno) == 1;
		}
		
		@Override
		public List<TestBoardVO> getList() {
			// getList() 메서드가 호출되면 메퍼에 getList2()를 호출한다.
			
			log.info("BoardServiceImpl.getList 메서드 실행.....");
			
			return mapper.getList2();
		}
		
}
