@Controller 
public class UserController{

	//로그인 페이지로 이동
	@RequestMapping("/main/login")
	public String login(){
		logger.info("경로 : login");
		return "user/login";
	}

	//회원 추가 페이지로 이동
	@RequestMapping("/main/insert")
	public String insert(){
		logger.info("경로 : insert");
		return "user/insert";
	}

	//변경 페이지로 이동
	@RequestMapping("/main/update")
	public String update(){
		logger.info("경로 : update");
		return "user/update";
	}

}


