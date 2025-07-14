package org.test.service;

import java.util.List;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.test.domain.TestBoardVO;

public interface TestBoardService {
	// 인터페이스는 단독으로 사용할 수 없는 객체임.
	// 인터페이스를 사용하려면 구현 클래스를 만들고 실행문을 넣게된다.
	
	public void register(TestBoardVO board); // 조장이 만든 메서드명 (시그니처)
	// 게시판 등록용 메서드
	
	public TestBoardVO get(Long t_bno);
	// 게시글 자세히 보기 (번호를 넣으면 객체가 나와야 한다)
	
	public boolean modify(TestBoardVO board);
	// 게시글 수정하기 (객체가 들어가서 수정이 됐는지 t/f)
	
	public boolean remove(Long t_bno);
	// 게시글 삭제하기 (번호가 들어가서 삭제됐는지 t/f)
	
	public List<TestBoardVO> getList();
	// 이 메서드가 호출되면 리스트 타입으로 BoardVO 객체들이 넘어온다
	// List : 동적 리스트 / <  > 제네릭 : 강제로 객체 타입을 정함.

}
