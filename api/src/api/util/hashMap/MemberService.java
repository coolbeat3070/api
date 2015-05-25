package api.util.hashMap;

public interface MemberService {
	public void join(String name, int age, String addr,String id, String password);
	public void login(String id, String password);
}
