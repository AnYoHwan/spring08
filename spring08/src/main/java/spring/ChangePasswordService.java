package spring;

public class ChangePasswordService {
	private MemberDao memberDao;
	
	public ChangePasswordService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void changePassword(String id, String oldPwd, String newPwd) {
		Member member = (Member) memberDao.selectById(id);
		if(member == null) {
			throw new MemberNotFoundException();
		}
		member.changPassword(oldPwd, newPwd);
		memberDao.update(member);
	}
}
