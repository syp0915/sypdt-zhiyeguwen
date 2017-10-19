package com.shfc.base.manager;


import com.shfc.base.dao.BaseBlockMapper;
import com.shfc.base.dao.BaseDistrictMapper;
import com.shfc.base.domain.BaseBlock;
import com.shfc.base.domain.BaseDistrict;
import com.shfc.base.dto.PlotDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaExtManager {
	

	@Autowired(required=false)
	private BaseDistrictMapper baseDistrictMapper;
	@Autowired(required=false)
	private BaseBlockMapper baseBlockMapper;
	
	public List<BaseDistrict> selectByCityId(String cityId) {
		return baseDistrictMapper.selectByCityId(cityId);
	}
	
	public List<BaseBlock>  selectByDistrictId(long districtId) {
		return baseBlockMapper.selectByDistrictId(districtId);
	}

	public BaseBlock  queryByBlockId(long blockId) {
		return baseBlockMapper.selectByPrimaryKey(blockId);
	}

	public List<PlotDTO> queryHotPlotByBlockId(long blockId){
		return  baseBlockMapper.queryHotPlotByBlockId(blockId);
	}
	
	

}
