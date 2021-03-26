package spring;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	private static MemberDao memberDao;

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:addCtx.xml");
		
		memberDao = ctx.getBean("memberDao", MemberDao.class);

		selectAll();
		updateMember();
		insertMember();
		selectAll();
		
		ctx.close();
	}
	
	private static void selectAll() {
		System.out.println("----- selectAll");
		int total = memberDao.count();
		System.out.println("전체 데이터 : " + total);
		List<Member> members = (List<Member>) memberDao.selectAll();
		for(Member m : members) {
			System.out.println(m.getId() + " : " + m.getEmail() + " : " + m.getName());
		}
	}
	
	private static void updateMember() {
		System.out.println("-----updateMember");
		Member member = (Member) memberDao.selectById("admin");
		String oldPw = member.getPassword();
		String newPw = Double.toHexString(Math.random());
		member.changPassword(oldPw, newPw);
		
		memberDao.update(member);
		System.out.println("암호 변경 : " + oldPw + " > " + newPw);
	}
	
	private static void insertMember() {
		System.out.println("-----insertMember");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
		String prefix = dateFormat.format(new Date());
		Member member = new Member(prefix + prefix + "@test.com", prefix, prefix, prefix, new Date());
		memberDao.insert(member);
		System.out.println(member.getId() + "데이터 추가");
		
	}
}
