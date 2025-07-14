package org.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.test.domain.TestBoardVO;

public interface TestBoardMapper {
	@Select("SELECT * FROM test_board WHERE t_bno > 0") 
	public List<TestBoardVO> getList(); // 추상메서드
	
	public List<TestBoardVO> getList2();
	
	public void insert(TestBoardVO board); // xml에서 쿼리 작성
	
	public void insertSelectKey(TestBoardVO board); // xml에서 쿼리 작성
	
	public TestBoardVO read(Long t_bno); // xml에서 쿼리 작성
	// 번호가 들어가면 객체로 나온다.
	
	public int delete(Long t_bno); // xml에서 쿼리 작성
	// 번호가 들어가면 삭제후 몇개가 삭제 됐는지 리턴한다.
	
	
	public int update(TestBoardVO board); // xml에서 쿼리작성
	// 번호가 들어가면 필드 수정후 몇개가 수정됐는지 리턴한다.
}
