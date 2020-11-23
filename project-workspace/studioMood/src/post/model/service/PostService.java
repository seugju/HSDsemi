package post.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp2.Jdbc41Bridge;

import common.JDBCTemplate;
import post.model.dao.PostDao;
import post.model.vo.Post;
import post.model.vo.PostPageData;

public class PostService {

	public PostPageData selectList(int reqPage) {
		Connection conn = JDBCTemplate.getConnection();
		PostDao dao = new PostDao();
		int totalCount = dao.totalCount(conn);
		int numPerPage = 10;
		int totalPage = 0;
		if(totalCount%numPerPage == 0) {
			totalPage = totalCount / numPerPage;
		}else {
			totalPage = totalCount/ numPerPage+1;
		}
		int start = (reqPage-1)*numPerPage +1;
		int end = reqPage*numPerPage;
		
		ArrayList<Post> list = new PostDao().selectList(conn,start,end);
		
		int pageNaviSize = 5;
		String pageNavi="";
		
		int pageNo = reqPage-2;
		if(reqPage <=3) {
			pageNo=1;
		}else if(pageNo>totalPage-4){
			pageNo = totalPage-4;
		}
		if(pageNo != 1) {
			pageNavi += "<a class='btn' href='/postList?reqPage="+(pageNo-1)+"'>이전</a>";
		}
		for(int i=0; i<pageNaviSize;i++) {
			if(reqPage == pageNo) {
				pageNavi += "<span class='selectPage'>"+pageNo+"</spna>";
			}else {
				pageNavi +="<a class='btn' href='./postList?reqPage="+pageNo+"'>"+pageNo+"</a>";
			}
			pageNo++;
			if(pageNo > totalPage) {
				break;
			}
		}
		if(pageNo <= totalPage) {
			pageNavi += "<a class='btn' href='/postList?reqPage="+pageNo+"'>다음</a>";
		}
		PostPageData ppd = new PostPageData(list, pageNavi);
		JDBCTemplate.close(conn);
		return ppd;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}