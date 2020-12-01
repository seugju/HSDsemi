package reservation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.vo.Member;
import reservation.model.vo.Reservation;

/**
 * Servlet implementation class ReservationLoginChkServlet
 */
@WebServlet(name = "ReservationLoginChk", urlPatterns = { "/reservationLoginChk" })
public class ReservationLoginChkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationLoginChkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		Member member = (Member)session.getAttribute("loginMember");
		Reservation reservation = new Reservation();
		reservation.setrDate(request.getParameter("r_date"));
		reservation.setsTime(request.getParameter("s_time"));
		reservation.seteTime(request.getParameter("e_time"));
		reservation.setConcept(request.getParameter("concept"));
		reservation.setrCheck("N");
		//이부분도 수정에선 결제가 된 이후일수도 있음 해결해야함
		reservation.setrPass(request.getParameter("r_pass"));
		reservation.setCutNum(Integer.parseInt(request.getParameter("cut")));
		if(member==null) {
			System.out.println("nnnn");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/reservation/nonMemResv.jsp");
			request.setAttribute("reservation", reservation);// 비회원 페이지에 예약데이터를 넘겨서 나머지값을 입력받도록 유도
			rd.forward(request, response);
		}else {
		System.out.println("!!!!");
			RequestDispatcher rd = request.getRequestDispatcher("/memberReservation");
			request.setAttribute("reservation", reservation);  //회원 예약 서블릿에는 로그인 객체와  예약 객체를 섞어 완성데이터 받기
			rd.forward(request, response);		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
