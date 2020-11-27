package member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	public int insertMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		String query = "insert into member values(?,?,?,?,?,?,?,?,1)";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getAddress());
			pstmt.setString(5, member.getEmail());
			pstmt.setString(6, member.getBirth());
			pstmt.setString(7, member.getGender());
			pstmt.setString(8, member.getPhone());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}JDBCTemplate.close(pstmt);
		
		return result;
	}

	public Member selectOneMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;
		String query = "select * from member where member_id=? and member_pw=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			rset = pstmt.executeQuery();
			System.out.println(member.getMemberId());
			System.out.println(member.getMemberPw());
			 
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

	public ArrayList<Member> selectAllMember(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> list = new ArrayList<Member>();
		String query = "select * from member";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset=pstmt.executeQuery();
			while (rset.next()) {
				Member m = new Member();
				m.setAddress(rset.getString("address"));
				m.setBirth(rset.getString("birth"));
				m.setEmail(rset.getString("email"));
				m.setGender(rset.getString("email"));
				m.setMemberId(rset.getString("member_id"));
				m.setMemberLevel(rset.getInt("member_level"));
				m.setMemberName(rset.getString("member_name"));
				m.setMemberPw(rset.getString("member_pw"));
				m.setPhone(rset.getString("phone"));
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}

	public int deleteMember(Connection conn, String memberId) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "delete from member where member_id=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public int updateMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "update member set phone=?, birth=?, email=?,address=? where member_id=?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getPhone());
			pstmt.setString(2, member.getBirth());
			pstmt.setString(3, member.getEmail());
			pstmt.setString(4, member.getAddress());
			pstmt.setString(5, member.getMemberId());
			result = pstmt.executeUpdate();
			System.out.println("Dao addr :"+member.getAddress());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
