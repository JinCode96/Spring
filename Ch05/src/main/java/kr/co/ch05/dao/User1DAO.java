package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User1VO;

@Repository // dao는 이 어노테이션을 사용
public class User1DAO {

	// Mybatis 선언
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertUser1(User1VO vo) {
		mybatis.insert("user1.insertUser1", vo);
	}
	
	public User1VO selectUser1(String uid) {
		return mybatis.selectOne("user1.selectUser1", uid); // selectOne 사용
	}
	
	public List<User1VO> selectUser1s() {
		
		List<User1VO> users = mybatis.selectList("user1.selectUser1s"); // selectList 사용
		
		return users;
	}
	
	public void updateUser1(User1VO vo) {
		mybatis.update("user1.updateUser1", vo);
	}
	
	public void deleteUser1(String uid) {
		mybatis.delete("user1.deleteUser1", uid);
	}
	
}
