package member.model.service;

import java.net.ConnectException;
import java.sql.Connection;

import common.JDBCTemplate;
import member.model.dao.MemberDao;
import member.model.vo.Member;

public class MemberService {

	public Member selectOneMember(String memberId) {
		Connection conn = JDBCTemplate.getConnection();
		Member result = new MemberDao().selectOneMember(conn,memberId);
		JDBCTemplate.close(conn);
		return result;
	}

	public int insertMember(Member member) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().insertMember(conn,member);
		if(result >0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}

	public Member selectOneMember(Member member) {
		Connection conn = JDBCTemplate.getConnection();
		Member loginMember = new MemberDao().selectOneMember(conn, member);
		JDBCTemplate.close(conn);
		return loginMember;
	}

}
