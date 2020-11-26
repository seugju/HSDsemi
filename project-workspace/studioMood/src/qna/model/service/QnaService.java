package qna.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import common.JDBCTemplate;
import qna.model.dao.QnaDao;
import qna.model.vo.Qna;
import qna.model.vo.QnaPageData;

public class QnaService {

	public QnaPageData selectList(int reqPage) {
		Connection conn = JDBCTemplate.getConnection();
		QnaDao dao = new QnaDao();
		int totalCount = dao.totalCount(conn);
		int numPerPage = 10;
		int totalPage = 0;
		if(totalCount%numPerPage == 0) {
			totalPage = totalCount/numPerPage;
		}else {
			totalPage = totalCount/numPerPage+1;
		}
		int start = (reqPage-1)*numPerPage +1;
		int end = reqPage*numPerPage;
		System.out.println("start : "+start);
		System.out.println("end : "+end);
		ArrayList<Qna> list = new QnaDao().selectList(conn, start, end);
		
		System.out.println("service "+list.size());
		int pageNaviSize = 5;
		String pageNavi = "";
		
		int pageNo = reqPage-2;
		if(reqPage<=3) {
			pageNo=1;
		}else if(pageNo>totalPage-4) {
			pageNo = totalPage-4;
		}
		if(pageNo != 1) {
			pageNavi += "<a class='btn' href='/qnaList?reqPage="+(pageNo-1)+"'>이전</a>";
		}
		for(int i = 0; i<pageNaviSize;i++) {
			if(reqPage == pageNo) {
				pageNavi += "<span class='selectPage'>"+pageNo+"</span>";
			}else {
				pageNavi += "<a class='btn' href='/qnaList?reqPage="+pageNo+"'>"+pageNo+"</a>";
			}
			pageNo++;
			if(pageNo>totalPage) {
				break;
			}
		}
		if(pageNo <= totalPage) {
			pageNavi += "<a class='btn' href='/qnaList?reqPage="+pageNo+"'>다음</a>";
		}
		
		QnaPageData qpd = new QnaPageData(list, pageNavi);
		JDBCTemplate.close(conn);
		return qpd;
	}

	public int insertQna(Qna q) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new QnaDao().insertQna(conn, q);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}

}
