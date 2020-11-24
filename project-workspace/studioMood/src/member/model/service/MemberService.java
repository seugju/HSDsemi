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

}
