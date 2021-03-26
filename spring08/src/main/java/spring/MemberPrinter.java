package spring;

public class MemberPrinter {
	public void print(Member member) {
		System.out.printf("회원정보 : 번호=%d, 아이디=%s, 이메일=%s, 이름=%s, 등록일=%tF\n", member.getNum(), member.getId(), member.getEmail(), member.getName(), member.getRegdate());
	}
}
