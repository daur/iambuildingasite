package com.dc.base.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dc.base.tube.HoneyFactory;

@Controller
public class RoseController {

	@RequestMapping("/rose")
	public String rose(Model model){
		model.addAttribute("message", HoneyFactory.getHoney());
		return "lab";
	}
}
