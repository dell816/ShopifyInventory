package com.ad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ad.beans.Book;
import com.ad.beans.Member;
import com.ad.dao.MemberDao;

@Controller
public class MemberController {
	
	@Autowired
	MemberDao daoM;

	/*
	 It displays a form to input data, here "command" is a reserved request
	 attribute which is used to display object data into form
	 */
	@RequestMapping("/memberform")
	public String showform(Model m) {
		m.addAttribute("command", new Member());
		return "memberform";
	}
	
	/*
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object. I need to mention RequestMethod.POST
	 */
	@RequestMapping(value = "/saveMember", method = RequestMethod.POST)
	public String saveMember(@ModelAttribute("member") Member member) {
		daoM.saveMember(member);
		return "redirect:/viewmember";// will redirect to viewmember request mapping
	}
	
	/* It provides list of employees in model object */
	@RequestMapping("/viewmember")
	public String viewmember(Model m) {
		List<Member> list = daoM.getMembers();
		m.addAttribute("list", list);
		return "viewmember";
	}
	
	/*
	  It displays object data into form for the given id. The @PathVariable puts
	  URL data into variable.
	 */
	@RequestMapping(value = "/editmember/{id}")
	public String editMember(@PathVariable int id, Model m) {
		Member member = daoM.getMemberById(id);
		m.addAttribute("command", member);
		return "membereditform";
	}
	
	/* It updates model object. */
	@RequestMapping(value = "/editsaveMember", method = RequestMethod.POST)
	public String editsaveMember(@ModelAttribute("member") Member member) {
		daoM.updateMember(member);
		return "redirect:/viewmember";
	}
	
	/* It deletes record for the given id in URL and redirects to /viewmember */
	@RequestMapping(value = "/deletemember/{id}", method = RequestMethod.GET)
	public String deleteMember(@PathVariable int id) {
		daoM.deleteMember(id);
		return "redirect:/viewmember";
	}
}
