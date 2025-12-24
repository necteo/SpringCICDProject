package com.sist.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sist.web.vo.FoodVO;

@Mapper
public interface FoodMapper {
	
	/*
	 * <select id="foodNearData4" resultType="com.sist.web.vo.FoodVO" parameterMap="string">
	     SELECT fno, name, poster
	     FROM (SELECT fno, name, poster 
	     	   FROM menupan_food
	     	   WHERE REGEXP_LIKE(address, #{address})
	     	   ORDER BY hit DESC)
	     WHERE rownum &lt;= 4
	   </select>
	 */
	public List<FoodVO> foodNearData4(String address);

}
