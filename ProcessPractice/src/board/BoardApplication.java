package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.request.board.PatchBoardDto;
import board.dto.request.board.PostBoardDto;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;

public class BoardApplication {

	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();
	
	private static final String SIGN_UP = "POST /sign-up"; // 쓰는 거 
	private static final String SIGN_IN = "POST /sign-in";
	
	private static final String POST_BOARD = "POST /board"; 
	
	private static final String GET_BOARD = "GET /board"; // 읽는 거, 가져오는 거 /받아오는 건 dto 안 만들거임
	private static final String GET_BOARD_LIST = "GET /board/list";
	
	private static final String PATCH_BOARD = "PATCH /board"; // 수정
	
	private static final String DELETE_BOARD = "DELETE /board"; // 삭제
	
			
	public static void main(String[] args) {
		// 입력을 여기서 받음
		while (true) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("URL End point : ");
			String endPoint = scanner.nextLine();
			
			switch(endPoint) {
			
			case SIGN_UP :
				SignUpDto signUpDto = new SignUpDto();
				System.out.print("이메일 주소 : ");
				signUpDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 : ");
				signUpDto.setPassword(scanner.nextLine());
				System.out.print("비밀번호 확인 : ");
				signUpDto.setPasswordCheck(scanner.nextLine());
				System.out.print("닉네임 : ");
				signUpDto.setNickname(scanner.nextLine());
				System.out.print("휴대전화 번호 : ");
				signUpDto.setPhoneNumber(scanner.nextLine());
				System.out.print("주소 : ");
				signUpDto.setAddress(scanner.nextLine());
				System.out.print("상세 주소 : ");
				signUpDto.setAddressDetail(scanner.nextLine());
				
				// System.out.println(signUpDto.toString()); -> 입력 잘 받았는지 확인
				
				userController.signUp(signUpDto);
				break;
				
			case SIGN_IN :
				SignInDto signInDto = new SignInDto();
				System.out.print("이메일 주소 : ");
				signInDto.setEmail(scanner.nextLine());
				System.out.print("비밀번호 : ");
				signInDto.setPassword(scanner.nextLine());
				
				// System.out.println(signInDto.toString());
				
				userController.signIn(signInDto);
				break;
				
			case POST_BOARD: 
				PostBoardDto postBoardDto = new PostBoardDto();
				System.out.print("제목 : ");
				postBoardDto.setTitle(scanner.nextLine());
				System.out.print("내용 : ");
				postBoardDto.setContent(scanner.nextLine());
				System.out.print("이미지 : ");
				postBoardDto.setBoardImageUrl(scanner.nextLine());
				System.out.print("작성자 이메일 : ");
				postBoardDto.setWriterEmail(scanner.nextLine());
				
				boardController.postBoard(postBoardDto);
				break;
				
			case GET_BOARD_LIST:

				boardController.getBoardList(); // 입력값 없음
				break;
				
			case GET_BOARD:
				
				int boardNumber  = 0;
				
				try {
					System.out.print("게시물 번호 : ");
					boardNumber = scanner.nextInt(); // 외부에서 받아옴 -> 예외 발생할 수 있음 (ex. 정수 X)
				} catch (Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.getBoard(boardNumber); // boardNumber가 try문 안에 있음 -> try문 밖에 선언
				break;
				
			case PATCH_BOARD: // 이걸 따로 메서드로 만들어도 됨. break 전까지 (맨 밑)
				PatchBoardDto patchBoardDto = new PatchBoardDto();
				try {
					System.out.print("게시물 번호 : ");
					String pacthBoardNumber = scanner.nextLine();
					patchBoardDto.setBoardNumber(Integer.parseInt(pacthBoardNumber)); // 문자열을 정수로
					System.out.print("제목 : ");
					patchBoardDto.setTitle(scanner.nextLine());
					System.out.print("내용 : ");
					patchBoardDto.setContent(scanner.nextLine());
					System.out.print("이미지 : ");
					patchBoardDto.setBoardImageUrl(scanner.nextLine());
					System.out.print("이메일 : ");
					patchBoardDto.setEmail(scanner.nextLine());
				} catch(Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.patchBoard(patchBoardDto);
				break;
			
			case DELETE_BOARD:
				int deleteBoardNumber = 0;
				String deleteEmail = null;
				try {
					System.out.print("게시물 번호 : ");
					deleteBoardNumber = Integer.parseInt(scanner.nextLine());
					System.out.print("이메일 : ");
					deleteEmail = scanner.nextLine();
				} catch(Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.deleteBoard(deleteBoardNumber, deleteEmail);
				break;
				
			 default:
				 System.out.println(HttpStatus.NOT_FOUND);
				 
			}
			
		}
		
	}
	
//	private void patchBoard() {
//		Scanner scanner = new Scanner(System.in);
//		try {
//			PatchBoardDto patchBoardDto = new PatchBoardDto();
//			
//			System.out.print("게시물 번호 : ");
//			String pacthBoardNumber = scanner.nextLine();
//			patchBoardDto.setBoardNumber(Integer.parseInt(pacthBoardNumber)); // 문자열을 정수로
//			System.out.print("제목 : ");
//			patchBoardDto.setTitle(scanner.nextLine());
//			System.out.print("내용 : ");
//			patchBoardDto.setContent(scanner.nextLine());
//			System.out.print("이미지 : ");
//			patchBoardDto.setBoardImageUrl(scanner.nextLine());
//			System.out.print("이메일 : ");
//			patchBoardDto.setEmail(scanner.nextLine());
//			
//			boardController.patchBoard(patchBoardDto);
//		} catch(Exception exception) {
//			exception.printStackTrace();
//		}
//		
//		
//	}

}
