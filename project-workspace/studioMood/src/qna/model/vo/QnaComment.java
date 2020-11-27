package qna.model.vo;

public class QnaComment {
	private int qnaCommentNo;
	private int qnaCommentLevel;
	private String qnaCommentWriter;
	private String qnaCommentContent;
	private int qnaRef;
	private int qnaCommentRef;
	private String qnaCommentDate;
	public QnaComment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QnaComment(int qnaCommentNo, int qnaCommentLevel, String qnaCommentWriter, String qnaCommentContent,
			int qnaRef, int qnaCommentRef, String qnaCommentDate) {
		super();
		this.qnaCommentNo = qnaCommentNo;
		this.qnaCommentLevel = qnaCommentLevel;
		this.qnaCommentWriter = qnaCommentWriter;
		this.qnaCommentContent = qnaCommentContent;
		this.qnaRef = qnaRef;
		this.qnaCommentRef = qnaCommentRef;
		this.qnaCommentDate = qnaCommentDate;
	}
	public int getQnaCommentNo() {
		return qnaCommentNo;
	}
	public void setQnaCommentNo(int qnaCommentNo) {
		this.qnaCommentNo = qnaCommentNo;
	}
	public int getQnaCommentLevel() {
		return qnaCommentLevel;
	}
	public void setQnaCommentLevel(int qnaCommentLevel) {
		this.qnaCommentLevel = qnaCommentLevel;
	}
	public String getQnaCommentWriter() {
		return qnaCommentWriter;
	}
	public void setQnaCommentWriter(String qnaCommentWriter) {
		this.qnaCommentWriter = qnaCommentWriter;
	}
	public String getQnaCommentContent() {
		return qnaCommentContent;
	}
	public void setQnaCommentContent(String qnaCommentContent) {
		this.qnaCommentContent = qnaCommentContent;
	}
	public int getQnaRef() {
		return qnaRef;
	}
	public void setQnaRef(int qnaRef) {
		this.qnaRef = qnaRef;
	}
	public int getQnaCommentRef() {
		return qnaCommentRef;
	}
	public void setQnaCommentRef(int qnaCommentRef) {
		this.qnaCommentRef = qnaCommentRef;
	}
	public String getQnaCommentDate() {
		return qnaCommentDate;
	}
	public void setQnaCommentDate(String qnaCommentDate) {
		this.qnaCommentDate = qnaCommentDate;
	}

}
