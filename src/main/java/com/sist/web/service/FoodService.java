package com.sist.web.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sist.web.vo.FoodVO;

public interface FoodService {
	
	/*
	 *  @Select("SELECT fno, name, poster "
			  + "FROM menupan_food "
			  + "ORDER BY fno "
			  + "OFFSET #{start} ROWS FETCH NEXT 12 ROWS ONLY")
		public List<FoodVO> foodListData(int start);
		
		@Select("SELECT CEIL(COUNT(*) / 12) FROM menupan_food")
		public int foodTotalPage();
		
		@Select("SELECT fno, name, poster "
			  + "FROM (SELECT fno, name, poster "
			  		+ "FROM menupan_food "
			  		+ "WHERE REGEXP_LIKE(address, #{address})"
			  		+ "ORDER BY fno) "
			  + "OFFSET #{start} ROWS FETCH NEXT 12 ROWS ONLY")
		public List<FoodVO> foodFindData(@Param("start") int start, @Param("address") String address);
	
		@Select("SELECT CEIL(COUNT(*) / 12) FROM menupan_food "
			  + "WHERE REGEXP_LIKE(address, #{address})")
		public int foodFindTotalPage(String address);
	 */
	public List<FoodVO> foodListData(int start);
	public int foodTotalPage();
	public List<FoodVO> foodFindData(int start, String address);
	public int foodFindTotalPage(String address);
	public FoodVO foodDetailData(int fno);

}
