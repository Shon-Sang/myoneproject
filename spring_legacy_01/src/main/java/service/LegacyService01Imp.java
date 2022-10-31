package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import dao.LegacyDao01;
import dao.LegacyDao01Imp;

@Service
public class LegacyService01Imp implements LegacyService01{

	private LegacyDao01 dao01;
	
	public LegacyService01Imp(LegacyDao01 dao01) {
		this.dao01 = dao01;
	}
	
	@Override
	public List<HashMap<String, String>> getData() {
		return dao01.getBoard();
	}
	
	private List<HashMap<String, String>> getLowerCaseMap(List<HashMap<String, String>> list){
		String buf;
		
		List<HashMap<String, String>> ans = new ArrayList<HashMap<String,String>>();
		
		for(Map<String, String> map : list) {
			HashMap<String, String> eleMap = new HashMap<String, String>();
			for(String key : map.keySet()) {
				buf = map.get(key);
				eleMap.put(key.toLowerCase(), buf);
			}
			ans.add(eleMap);
		}
		
		return ans;
	}
//	private SqlSession ss;
//	private LegacyDao01 ld;
//	
//	public LegacyService01Imp(SqlSession ss) {
//		this.ss = ss;
//		this.ld = this.ss.getMapper(LegacyDao01.class);
//	}
//	
//	@Override
//	public List<HashMap<String, String>> getData() {
//		return ld.getBoard();
//	}
}
