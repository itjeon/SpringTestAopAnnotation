package lejit.test.aopAnn.service.impl;

import java.util.List;

import lejit.test.aopAnn.service.BoardVO;

public interface BoardDAO {
	List<BoardVO> selectBoardList() throws Exception;
}
