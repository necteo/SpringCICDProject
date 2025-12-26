package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.BoardMapper;
import com.sist.web.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private final BoardMapper mapper;

	@Override
	public List<BoardVO> boardListData(int start) {
		return mapper.boardListData(start);
	}

	@Override
	public int boardTotalCount() {
		return mapper.boardTotalCount();
	}

	@Override
	public void boardInsert(BoardVO vo) {
		mapper.boardInsert(vo);
	}

	@Override
	public BoardVO boardDetailData(int no) {
		mapper.boardHitIncrement(no);
		return mapper.boardDetailData(no);
	}

	@Override
	public String boardDelete(int no, String pwd) {
		String res = "no";
		String db_pwd = mapper.boardGetPassword(no);
		if (db_pwd.equals(pwd)) {
			mapper.boardDelete(no);
			res = "yes";
		}
		return res;
	}

	@Override
	public String boardUpdate(BoardVO vo) {
		String res = "no";
		String db_pwd = mapper.boardGetPassword(vo.getNo());
		if (db_pwd.equals(vo.getPwd())) {
			mapper.boardUpdate(vo);
			res = "yes";
		}
		return res;
	}

	@Override
	public BoardVO boardUpdateData(int no) {
		return mapper.boardDetailData(no);
	}

}
