package board.dto.response.board;

import java.util.List;

import board.entity.Board;
import board.entity.Comment;
import board.entity.Like;

public class GetBoardResponseDto {
	
	private int boardNumber;
	private String title;
	private String content;
	private String boardImageUrl;
	private String writerEmail;		// 작성자만 더보기 아이콘 볼 수 있으니까 알아야 함
	private String writerProfileImageUrl;
	private String writerNickname;
	private String writeDate;
	private int likeCount;
	private List<Like> likeList;
	private int commentCount;
	private List<Comment> commnetList;
	
	public GetBoardResponseDto() {}

	public GetBoardResponseDto(int boardNumber, String title, String content, String boardImageUrl, String writerEmail,
			String writerProfileImageUrl, String writerNickname, String writeDate, int likeCount, List<Like> likeList,
			int commentCount, List<Comment> commnetList) {
		this.boardNumber = boardNumber;
		this.title = title;
		this.content = content;
		this.boardImageUrl = boardImageUrl;
		this.writerEmail = writerEmail;
		this.writerProfileImageUrl = writerProfileImageUrl;
		this.writerNickname = writerNickname;
		this.writeDate = writeDate;
		this.likeCount = likeCount;
		this.likeList = likeList;
		this.commentCount = commentCount;
		this.commnetList = commnetList;
	}

	public GetBoardResponseDto(Board board) {
		this.title = board.getTitle();
		this.content = board.getContent();
		this.boardImageUrl = board.getBoardImageUrl();
		this.writerEmail = board.getWriterEmail();
		this.writerProfileImageUrl = board.getWriterProfileImageUrl();
		this.writerNickname = board.getWriterNickname();
		this.writeDate = board.getWriteDate();
		this.likeCount = board.getLikeList().size();
		this.likeList = board.getLikeList();
		this.commentCount = board.getCommentList().size();
		this.commnetList = board.getCommentList();
	}
	
	public int getBoardNumber() {
		return boardNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getBoardImageUrl() {
		return boardImageUrl;
	}

	public String getWriterEmail() {
		return writerEmail;
	}

	public String getWriterProfileImageUrl() {
		return writerProfileImageUrl;
	}

	public String getWriterNickname() {
		return writerNickname;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public List<Like> getLikeList() {
		return likeList;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public List<Comment> getCommnetList() {
		return commnetList;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setBoardImageUrl(String boardImageUrl) {
		this.boardImageUrl = boardImageUrl;
	}

	public void setWriterEmail(String writerEmail) {
		this.writerEmail = writerEmail;
	}

	public void setWriterProfileImageUrl(String writerProfileImageUrl) {
		this.writerProfileImageUrl = writerProfileImageUrl;
	}

	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public void setLikeList(List<Like> likeList) {
		this.likeList = likeList;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public void setCommnetList(List<Comment> commnetList) {
		this.commnetList = commnetList;
	}

	@Override
	public String toString() {
		return "GetBoardResponseDto [boardNumber=" + boardNumber + ", title=" + title + ", content=" + content
				+ ", boardImageUrl=" + boardImageUrl + ", writerEmail=" + writerEmail + ", writerProfileImageUrl="
				+ writerProfileImageUrl + ", writerNickname=" + writerNickname + ", writeDate=" + writeDate
				+ ", likeCount=" + likeCount + ", likeList=" + likeList + ", commentCount=" + commentCount
				+ ", commnetList=" + commnetList + "]";
	}


	
	
	
	// boardNumber를 더하는 수정보다 얘를 상속받는 클래스를 만들어서 (확장에는 개방적, 수정에는 폐쇄적)
	
}
