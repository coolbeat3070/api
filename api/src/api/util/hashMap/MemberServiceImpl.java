package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
//	HashMap<AccountVO,PersonVO> map = new HashMap<AccountVO,PersonVO>(); 이렇게 해도 되지만..
	String name, addr, id, password;
	int age;
	Map<String,String> map = new HashMap<String,String>();
	MemberVO member = new MemberVO();
	@Override
	public void join(String name, int age, String addr, String id,
			String password) {
		
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setAge(age);
		member.setAddr(addr);
	/*
	 * 1. 첫번째 에러 유형
	 * map.put(member.getId(), member.getPassword());
	 * */	
		map.put("id", member.getId());
		map.put("password", member.getPassword());
		map.put("name", member.getName());
	/*
	 * 2. 두번째 에러 유형
	 * map.put("age", member.getAge());
	 * valueOf() 는 api.lang.string.ValueOfDemo 참조
	 * */
		map.put("age", String.valueOf(member.getAge()));
		map.put("addr", member.getAddr());
		
		
		
	}

	@Override
	public void login(String id, String password) {
		/*
		 * 3. 세번째 에러 유형
		 * map.get(id) 파라미터 유형을 "id"
		 * */
		System.out.println("맵에 담긴 ID 값 :"+map.get("id"));
		
		if(!map.containsKey("id")){
			System.out.println("입력하신 id 는 존재하지 않습니다. 다시 입력하세요");
		}else{
			if(!(map.get("password").equals(password))){
				System.out.println("비번이 다릅니다. 다시 입력하세요");
			}else{
				System.out.println("환영합니다..."
						+ member.getAddr()+ " 에 사시는 "
						+ member.getAge()+" 세 "
						+ member.getName()+" 님");
			}
		}
		
	}


}
