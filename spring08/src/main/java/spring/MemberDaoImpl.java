package spring;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class MemberDaoImpl implements MemberDao {
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public MemberDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public void update(Member member) {
		sqlSessionTemplate.update("update", member);
	}
	
	@Override
	public void insert(Member member) {
		sqlSessionTemplate.insert("insert", member);
	}
	
	@Override
	public Member selectById(String id) {
		return sqlSessionTemplate.selectOne("selectById", id);
	}
	
	@Override
	public List<Member> selectAll(){
		return sqlSessionTemplate.selectList("list");
	}
	
	@Override
	public int count() {
		return sqlSessionTemplate.selectOne("count");
	}
	
	@Override
	public List<Member> selectByRegdate(Date from, Date to){
		HashMap<String, Date> map = new HashMap<String, Date>();
		map.put("from", from);
		map.put("to", to);
		return sqlSessionTemplate.selectList("selectByRegdate", map);
	}
	
	@Override
	public Member selectByNum(Long num) {
		List<Member> results = sqlSessionTemplate.selectList("selectByNum", num);
		return results.isEmpty() ? null : results.get(0);
	}
}
