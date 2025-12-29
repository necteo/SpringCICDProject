package com.sist.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sist.web.vo.MemberVO;

@Mapper
public interface MemberMapper {
	
	// ID체크
	@Select("SELECT COUNT(*) FROM member_3 WHERE id = #{id}")
	public int memberIdCheck(String id);
	
	// PWD체크
	@Select("SELECT pwd, name, id, address, sex "
		  + "FROM member_3 "
		  + "WHERE id = #{id}")
	public MemberVO memberInfoData(String id);

}
