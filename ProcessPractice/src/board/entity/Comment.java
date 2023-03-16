package board.entity;
// 댓글
//
// 댓글 작성자 프로필 사진(문자열) /
// 댓글 작성자 닉네임(문자열) /
// 댓글 작성 날짜 및 시간(날짜) /
// 댓글 내용(문자열)
import java.util.Date;

public class Comment {
	private String writerProfileImageUrl;
	private String writerNickname;
	private Date writeDateTime;
	private String content;
	
	public Comment() {}

	public Comment(String writerProfileImageUrl, String writerNickname, Date writeDateTime, String content) {
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writerNickname = writerNickname;
		this.writeDateTime = writeDateTime;
		this.content = content;
	}

	public String getWriterProfileImageUrl() {
		return writerProfileImageUrl;
	}

	public String getWriterNickname() {
		return writerNickname;
	}

	public Date getWriteDateTime() {
		return writeDateTime;
	}

	public String getContent() {
		return content;
	}

	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}

	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}

	public void setWriteDateTime(Date writeDateTime) {
		this.writeDateTime = writeDateTime;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Comment [writerProfileImageUrl=" + writerProfileImageUrl + ", writerNickname=" + writerNickname
				+ ", writeDateTime=" + writeDateTime + ", content=" + content + "]";
	}
	
}
