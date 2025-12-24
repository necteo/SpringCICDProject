package com.sist.web.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sist.web.vo.BusanVO;

@Mapper
public interface BusanMapper {
	
	/*
	 * <select id="busanListData" resultType="com.sist.web.vo.BusanVO" parameterType="hashmap">
	     SELECT no, title, image1, contentid, address, hit, contenttype
	     FROM busantravel 
	     <include refid="where-sql"/>
	     ORDER BY no
	     OFFSET #{start} ROWS FETCH NEXT 6 ROWS ONLY
	   </select>
	 */
	public List<BusanVO> busanListData(Map<String, Object> map);
	/*
	   <select id="busanTotalPage" resultType="int" parameterType="hashmap">
	     SELECT CEIL(COUNT(*) / 6)
	     FROM busantravel
	     <include refid="whre-sql"/>
	   </select>
	 */
	public int busanTotalPage(Map<String, Object> map);
	
	@Update("UPDATE busantravel "
		  + "SET hit = hit + 1 "
		  + "WHERE no = #{no}")
	public void busanHitIncrement(int no);
	
	@Select("SELECT * FROM busantravel "
		  + "WHERE no = #{no}")
	public BusanVO busanDetailData(int no);

}
