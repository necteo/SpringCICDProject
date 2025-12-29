package com.sist.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sist.web.vo.ReplyVO;

@Mapper
public interface ReplyMapper {
	
	@Select("SELECT no, cno, type, id, name, msg, TO_CHAR(regdate, 'YYYY-MM-DD HH24:MI:SS') dbday "
		  + "FROM comment_3 "
		  + "WHERE cno = #{cno} AND type = #{type}"
		  + "ORDER BY no DESC")
	public List<ReplyVO> replyListData(@Param("cno") int cno, @Param("type") int type);
	
	@Insert("INSERT INTO comment_3 "
		  + "VALUES((SELECT NVL(MAX(no) + 1, 1) FROM comment_3), #{cno}, #{type}, #{id}, #{name}, #{msg}, SYSDATE)")
	public void replyInsert(ReplyVO vo);

}
