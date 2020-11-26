package reservation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reservation.model.service.ReservationService;
import reservation.model.vo.Reservation;

/**
 * Servlet implementation class ChkReserveServlet
 */
@WebServlet(name = "ChkReserve", urlPatterns = { "/chkReserve" })
public class ChkReserveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChkReserveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		String phone = request.getParameter("phone");
		String pw = request.getParameter("pw");
		Reservation r = new ReservationService().selectReservation(phone, pw);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/reservation/chkReserve.jsp");
		//만약 조회결과에서 비밀번호가 다르다면
		if(r.getPhone()==null) {
			request.setAttribute("alertMsg","일치하는 번호가 없거나 비밀번호가 다릅니다.");
		}
		request.setAttribute("chkReserve", r);
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
