package board.controller;

import board.service.BoardService;

public class BoardController {

	private BoardService boardService;
	// BoardService에 의존적
	public BoardController() {
		boardService = new BoardService();
	}
	
}
