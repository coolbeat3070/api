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
		member.setAge(20);
		member.setAddr(addr);
		map.put(member.getId(), member.getPassword());
		
	}

	@Override
	public void login(String id, String password) {
		
		if(!map.containsKey(id)){
			System.out.println("입력하신 id 는 존재하지 않습니다. 다시 입력하세요");
		}else{
			if(!(map.get(password).equals(password))){
				System.out.println("비번이 다릅니다. 다시 입력하세요");
			}else{
				System.out.println("환영합니다..."
						+ member.getAddr()+ " 에 사시는 "
						+ member.getAge()+" 세 "
						+ member.getName()+" 님");
			}
		}
		/*if(!map.get("id").equals(id)){
			System.out.println("입력하신 id 는 존재하지 않습니다. 다시 입력하세요");
		}else{
			if(!(map.get("pass").equals(password))){
				System.out.println("비번이 다릅니다. 다시 입력하세요");
			}else{
				System.out.println("환영합니다"+map.get(name)+"님");
			}
		}*/
	}


}
