package com.sist.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.BusanMapper;
import com.sist.web.mapper.FoodMapper;
import com.sist.web.vo.BusanVO;
import com.sist.web.vo.FoodVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BusanServiceImpl implements BusanService {
	
	private final BusanMapper mapper;
	private final FoodMapper fMapper;

	@Override
	public List<BusanVO> busanListData(Map<String, Object> map) {
		return mapper.busanListData(map);
	}

	@Override
	public int busanTotalPage(Map<String, Object> map) {
		return mapper.busanTotalPage(map);
	}

	@Override
	public BusanVO busanDetailData(int no) {
		mapper.busanHitIncrement(no);
		return mapper.busanDetailData(no);
	}

	@Override
	public List<FoodVO> foodNearData4(String address) {
		return fMapper.foodNearData4(address);
	}

}
