package post.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import post.model.service.PostService;
import post.model.vo.Post;
import post.model.vo.PostPageData;

/**
 * Servlet implementation class SearchKeywordServlet
 */
@WebServlet(name = "SearchKeyword", urlPatterns = { "/searchKeyword" })
public class SearchKeywordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchKeywordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String keyword = request.getParameter("keyword");
		String type = request.getParameter("type");
		int reqPage = Integer.parseInt(request.getParameter("reqPage"));
		
		ArrayList<Post> list = new PostService().searchKeyword(keyword, type);
		PostPageData ppd = new PostService().searchList(reqPage, keyword);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/post/postList.jsp");
		request.setAttribute("list", list);
		request.setAttribute("type", type);
		request.setAttribute("keyword", keyword);
		request.setAttribute("list", ppd.getList());
		request.setAttribute("pageNavi", ppd.getPageNavi());
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
