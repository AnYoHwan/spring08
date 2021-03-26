package spring;

import java.util.Date;

public class MemberRegisterService {
	private MemberDao memberDao;
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void regist(RegisterRequest req) {
		Member member = (Member) memberDao.selectById(req.getId());
		if(member != null) {
			throw new AlreadyExistingMemberException("dup email" + req.getId());
		}
		
	Member newMember = new Member(
			req.getId(),
			req.getEmail(),
			req.getPassword(),
			req.getName(),
			new Date());
	memberDao.insert(newMember);
	}
}
