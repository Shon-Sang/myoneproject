package asset;

import java.util.HashMap;

public class LowerMap extends HashMap<String, String>{
	
	
	@Override
	public String put(String key, String value) {
		return super.put(key.toLowerCase(), value);
	}
}
