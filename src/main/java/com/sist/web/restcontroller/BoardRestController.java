package com.sist.web.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.service.BoardService;
import com.sist.web.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board/")
public class BoardRestController {
	
	private final BoardService bService;
	
	@GetMapping("list_vue")
	public ResponseEntity<Map<String, Object>> board_list(@RequestParam("page") int page) {
		Map<String, Object> map = new HashMap<>();
		try {
			int start = (page - 1) * 10;
			List<BoardVO> list = bService.boardListData(start);
			int count = bService.boardTotalCount();
			int totalpage = (int) (Math.ceil(count / 10.0));
			
			map.put("list", list);
			map.put("curpage", page);
			map.put("totalpage", totalpage);
			map.put("count", count - start);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	// 글쓰기
	/*
	 *   @RequestBody => JSON => 객체 변환
	 *   			  => javascript에서 전송된 값
	 *   @ModelAttribute => Spring 자체에서 처리
	 *   	| 커맨드 객체값 받는 경우
	 *   	  -------- VO
	 *   @RequestParam => getParameter()
	 *   
	 *   => mybatis : procedure / function / trigger
	 *   			  -------------------------------
	 *   			  PL/SQL : 호불호
	 *   					   ERP
	 *   			  => 댓글
	 *   			  => JOIN / SUBQUERY => Function
	 *   			  => replycount / likecount => Trigger
	 *   => 동적 쿼리 : 검색
	 *   ---------------------------------------------- JPA
	 */
	@PostMapping("insert_vue")
	public ResponseEntity<Map<String, Object>> board_insert(@RequestBody BoardVO vo) {
		Map<String, Object> map = new HashMap<>();
		try {
			bService.boardInsert(vo);
			map.put("msg", "yes");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
	@GetMapping("detail_vue")
	public ResponseEntity<BoardVO> board_detail(@RequestParam("no") int no) {
		BoardVO vo = null;
		try {
			vo = bService.boardDetailData(no);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(vo, HttpStatus.OK);
	}
	
	@GetMapping("delete_vue")
	public ResponseEntity<Map<String, String>> board_delete(@RequestParam("no") int no, @RequestParam("pwd") String pwd) {
		Map<String, String> map = new HashMap<>();
		try {
			String res = bService.boardDelete(no, pwd);
			map.put("msg", res);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping("update_vue")
	public ResponseEntity<BoardVO> board_update(@RequestParam("no") int no) {
		BoardVO vo = null;
		try {
			vo = bService.boardUpdateData(no);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(vo, HttpStatus.OK);
	}
	
	@PutMapping("update_ok_vue")
	public ResponseEntity<Map<String, String>> board_update_ok(@RequestBody BoardVO vo) {
		Map<String, String> map = new HashMap<>();
		try {
			String res = bService.boardUpdate(vo);
			map.put("msg", res);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
	
}
