package lejit.test.aopAnn.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> selectBoardList() throws Exception;
}
