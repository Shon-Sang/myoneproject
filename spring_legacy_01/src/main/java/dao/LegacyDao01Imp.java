package dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LegacyDao01Imp implements LegacyDao01{

	private SqlSessionTemplate sst;
	
	public LegacyDao01Imp() {
	}
	
	public LegacyDao01Imp(SqlSessionTemplate sst) {
		this.sst = sst;
	}
	
	@Override
	public List<HashMap<String, String>> getBoard() {
		
		return sst.selectList("legacy01.boardAllGet");
	}
}
