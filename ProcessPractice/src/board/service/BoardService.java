package board.service;

import board.repository.BoardRepository;

public class BoardService {
	
	private BoardRepository boardRepository;
	// BoardRepository에 의존적
	public BoardService() {
		boardRepository = new BoardRepository();
	}
	
}
