package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JDBCTemplate;
import member.model.vo.Member;

public class MemberDao {

	public Member selectOneMember(Connection conn, String memberId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;
		String query = "select * from member where member_id=?";
		
		try {
			pstmt= conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				loginMember = new Member();
				loginMember.setAddress(rset.getString("address"));
				loginMember.setBirth(rset.getString("birth"));
				loginMember.setEmail(rset.getString("email"));
				loginMember.setGender(rset.getString("gender"));
				loginMember.setMemberId(rset.getString("member_id"));
				loginMember.setMemberLevel(rset.getInt("member_level"));
				loginMember.setMemberName(rset.getString("member_name"));
				loginMember.setMemberPw(rset.getString("member_pw"));
				loginMember.setPhone(rset.getString("phone"));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return loginMember;
	}

}
