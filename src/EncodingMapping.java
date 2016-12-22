import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class EncodingMapping {
	private static Map<Character,Integer> encodeMap = new LinkedHashMap<Character,Integer>();
	private static EncodingMapping em=null;
	private EncodingMapping() {
		encodeMap.put('A',2);
		encodeMap.put('B',2);
		encodeMap.put('C',2);
		encodeMap.put('D',3);
		encodeMap.put('E',3);
		encodeMap.put('F',3);
		encodeMap.put('G',4);
		encodeMap.put('H',4);
		encodeMap.put('I',4);
		encodeMap.put('J',5);
		encodeMap.put('K',5);
		encodeMap.put('L',5);
		encodeMap.put('M',6);
		encodeMap.put('N',6);
		encodeMap.put('O',6);
		encodeMap.put('P',7);
		encodeMap.put('Q',7);
		encodeMap.put('R',7);
		encodeMap.put('S',7);
		encodeMap.put('T',8);
		encodeMap.put('U',8);
		encodeMap.put('V',8);
		encodeMap.put('W',9);
		encodeMap.put('X',9);
		encodeMap.put('Y',9);
		encodeMap.put('Z',9);
        
	}
	   		
	public int  returnCharValues(char numberEncode){
		  return encodeMap.get(numberEncode);
	}
	
	public static EncodingMapping getInstance(){
		if(em == null){
			em = new EncodingMapping();
		}
		return em;
	}


}
