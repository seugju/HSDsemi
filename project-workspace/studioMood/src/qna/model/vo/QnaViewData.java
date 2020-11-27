package qna.model.vo;

import java.util.ArrayList;

public class QnaViewData {
	private Qna n;
	private ArrayList<QnaComment> list;
	public QnaViewData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QnaViewData(Qna n, ArrayList<QnaComment> list) {
		super();
		this.n = n;
		this.list = list;
	}
	public Qna getN() {
		return n;
	}
	public void setN(Qna n) {
		this.n = n;
	}
	public ArrayList<QnaComment> getList() {
		return list;
	}
	public void setList(ArrayList<QnaComment> list) {
		this.list = list;
	}
	
}
