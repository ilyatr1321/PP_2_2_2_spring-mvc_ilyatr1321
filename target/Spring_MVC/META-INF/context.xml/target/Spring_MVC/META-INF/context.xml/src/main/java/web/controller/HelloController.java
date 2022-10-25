package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Zdarova banditi");
		messages.add("Eto mat' ego moe pervoe web prilozhenie");
		messages.add("Wiglyadit mosh'no, ne pravda li?");
		model.addAttribute("messages", messages);
		return "index";
	}

}