package Project.Human_Disease_Detection_and_Treatment_Plan_generation.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String homePage() {
		return "homePage";
	}
	
}
