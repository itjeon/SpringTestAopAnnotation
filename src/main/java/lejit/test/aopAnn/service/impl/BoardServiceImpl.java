package lejit.test.aopAnn.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lejit.test.aopAnn.service.BoardService;
import lejit.test.aopAnn.service.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

//	@Autowired
//	private BoardDAO boardMapper;
	
	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		
//		return boardMapper.selectBoardList();
	    return new ArrayList<BoardVO>();
		
	}

}
