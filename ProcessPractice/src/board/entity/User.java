package board.entity;
// 회원
//
// 이메일 주소(문자열) / 비밀번호(문자열) / 닉네임(문자열) /
// 핸드폰 번호(문자열) / 주소(문자열) / 상세 주소(문자열) /
// 프로필 사진(문자열-이미지 링크)

// 보관하고 관리할 애들로 쓸 애들 (passwordCheck는 계속 관리할 필요 X)
// 지속적인 애들만 넣어준다
// 수정작업이 잘 일어나지 않으면 setter를 만들지 않음
public class User {
	private String email;
	private String password;
	private String nickname;
	private String phoneNumber;
	private String address;
	private String addressDetail;
	private String profileImageUrl;
	
	public User() {}

	public User(String email, String password, String nickname, String phoneNumber, String address,
			String addressDetail, String profileImageUrl) {
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.profileImageUrl = profileImageUrl;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getNickname() {
		return nickname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", nickname=" + nickname + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", addressDetail=" + addressDetail + ", profileImageUrl="
				+ profileImageUrl + "]";
	}
	
	
}


