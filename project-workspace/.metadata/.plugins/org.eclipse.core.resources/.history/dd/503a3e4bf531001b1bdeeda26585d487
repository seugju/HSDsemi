package reservation.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import common.JDBCTemplate;
import reservation.model.dao.ReservationDao;
import reservation.model.vo.Reservation;

public class ReservationService {

	public ArrayList<Reservation> selectAllReservation() {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Reservation> list = new ReservationDao().selectAllReservation(conn);
		JDBCTemplate.close(conn);
		return list;
	}

	public Reservation selectReservation(String phone, String pw) {
		Connection conn = JDBCTemplate.getConnection();
		Reservation r = new ReservationDao().selectReservation(conn,phone,pw);
		JDBCTemplate.close(conn);
		return r;
	}

	public int deleteReservation(String phone) {
		// TODO Auto-generated method stub
		Connection conn = JDBCTemplate.getConnection();
		int result = new ReservationDao().deleteReservation(conn,phone);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}
	
	public int deleteReservation(int rNum) {
		// TODO Auto-generated method stub
		Connection conn = JDBCTemplate.getConnection();
		int result = new ReservationDao().deleteReservation(conn,rNum);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}

	public int updateReservation(String phone, String s_time, String e_time) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new ReservationDao().updateReservation(conn,phone,s_time,e_time);
		if(result>0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		return result;
	}

	public Reservation selectReservation(int rNum) {
		Connection conn = JDBCTemplate.getConnection();
		Reservation r = new ReservationDao().selectReservation(conn,rNum);
		JDBCTemplate.close(conn);
		return r;
	}

}
