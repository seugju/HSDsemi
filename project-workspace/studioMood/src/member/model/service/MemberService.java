package member.model.service;

import java.net.ConnectException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthScrollBarUI;

import common.JDBCTemplate;
import member.model.dao.MemberDao;
import member.model.vo.Member;
import member.model.vo.MemberPageData;

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

	public ArrayList<Member> selectAllMember() {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Member> list = new MemberDao().selectAllMember(conn);
		JDBCTemplate.close(conn);
		return list;
	}

	public int deleteMember(String memberId) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().deleteMember(conn,memberId);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else{
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}

	public int updateMember(Member member) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new MemberDao().updateMember(conn,member);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}

	public MemberPageData selectMembers(int reqPage) {
		Connection conn = JDBCTemplate.getConnection();
		MemberDao dao = new MemberDao();
		
		int totalCount = dao.totalCount(conn);		//총 멤버수를 구하는 dao
		int numPerPage = 10;						//한페이지당 조회되는 멤버 수
		int totalPage = 0;
		
		
		
		if(totalCount % numPerPage == 0) {
			totalPage = totalCount/numPerPage;
		}else {
			totalPage=totalCount/numPerPage +1;
		}
		
		System.out.println("reqPage memberservice : " + reqPage);
		
		
		//reqPage 1  -> start : 1, end : 10
		//reqPage 2  -> start : 11, end : 20
		//reqPage 3  -> start : 21, end : 30
		
		int start = (reqPage -1) * numPerPage+1;
		int end = reqPage *numPerPage;
		
		ArrayList<Member> list = dao.selectMembers(conn,start,end);
		
		int pageNaviSize = 5;
		String pageNavi = "";
		
		int pageNo = 0;
		if(reqPage <=3) {
			pageNo = ((reqPage-1)/pageNaviSize)*pageNaviSize+1;
		}else if(reqPage >= totalPage-1){
			pageNo = totalPage-4;
		}else{
			pageNo = (reqPage-2);
		}
		
		
		//이전버튼 만들기 -> 페이지 시작번호가 1이 아닌 경우에만 이전 버튼 생성  
		if(pageNo != 1) {
				pageNavi += "<a class='btn' href='/adminMembers?reqPage="+(pageNo-1)+"'>이전</a>";
		}
		
		//페이지 네비게이션 숫자
		for(int i=0; i<pageNaviSize; i++) {
			if(reqPage == pageNo) {     //페이지네비가 현재 요청 페이지인 경우 (a태그가 필요 X) 
				pageNavi += "<span class= 'selectPage'>"+pageNo+"</span>";
			}else {
				pageNavi += "<a class='btn' href='/adminMembers?reqPage="+pageNo+"'>"+pageNo+"</a>";
			}
			
			pageNo++;
			
			if(pageNo > totalPage) {
				break;
			}
			
		}
		
		//다음버튼 
		if(pageNo <= totalPage) {
			pageNavi += "<a class='btn' href = '/adminMembers?reqPage="+pageNo+"'>다음</a>";
		}
		 
		MemberPageData mpd = new MemberPageData(list,pageNavi);
		JDBCTemplate.close(conn);
		return mpd;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
