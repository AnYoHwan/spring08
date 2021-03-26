package spring;

public class AuthService {
	private MemberDao memberDao;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public AuthInfo authenticate(String id, String password) {
		Member member = (Member) memberDao.selectById(id);
		if(member == null) {
			throw new IdPasswordNotMatchingException();
		}
		if(!member.matchPassword(password)) {
			throw new IdPasswordNotMatchingException();
		}
		return new AuthInfo(member.getNum(), member.getId(), member.getEmail(), member.getName());
	}
}
