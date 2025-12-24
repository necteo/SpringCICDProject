package com.sist.web.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sist.web.vo.SeoulVO;

@Mapper
public interface SeoulMapper {
	
	/*
	 * <select id="seoulListData" resultType="com.sist.web.vo.SeoulVO" parameterType="hashmap">
	     SELECT no, title, poster, address, hit
	     FROM ${table_name}
	     ORDER BY no
	     OFFSET #{start} ROWS FETCH NEXT 12 ROWS ONLY
	   </select>
	 */
	public List<SeoulVO> seoulListData(Map<String, Object> map);
	// public abstract
	// 1.8 => default 메소드 => 구현 메소드 => 추상클래스 대체
	// 공통적으로 적용되는 기능 설정
	/*
	   <select id="seoulTotalPage" resultType="int" parameterType="hashmap">
	     SELECT CEIL(COUNT(*) / 12)
	     FROM ${table_name}
	   </select>
	 */
	public int seoulTotalPage(Map<String, Object> map);
	// => 인터페이스는 서로 다른 클래스 연결 (리모컨) => 모든 변수/모든 메소드는 public

}
