package day10.util;
/*
[[ HashMap Class ]]
	- Map 인터페이스를 구현한 클레스이다.
	- Key 값, Value 값을 쌍으로 저장한다. (사전형태)
	- Key 값은 중복 불가.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass05 {
	public static void main(String[] args) {
		// HashMap 객체 생성
		HashMap<String, String> map1 = new HashMap<>();
		
		// 데이터 저장하기
		map1.put("Hello", "안녕하세요");
		map1.put("Car", "자동차");
		map1.put("TIGER", "호랑이");
		// Key값. 중복안됨. 중복해서 작성할 경우 마지막에 작성한 내용이 덮어쓰기 됨
		
		// 데이터 얻어오기
		String value = map1.get("Hello");	// 키값으로 값 가져오기
		
		System.out.println("value : "+ value);
		
		// Map에 있는 키값 불러오기 (Set으로 변환)
		Set<String> set = map1.keySet();
		
		// Set -> 반복자 객체
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String keyValue = it.next(); // 키값 하나씩 읽어온다.
			
			// 해당 키 값에 할당되어있는 value 값을 읽어온다.
			String value2 = map1.get(keyValue);
			
			// value 값 출력해오기
			System.out.println(value2);
			
		}
		
		
	}

}
