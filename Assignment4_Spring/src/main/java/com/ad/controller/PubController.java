package com.ad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ad.beans.Pub;
import com.ad.dao.PubDao;

@Controller
public class PubController {

	@Autowired
	PubDao daoP;
	
	/*
	 It displays a form to input data, here "command" is a reserved request
	 attribute which is used to display object data into form
	 */
	@RequestMapping("/pubform")
	public String showform(Model m) {
		m.addAttribute("command", new Pub());
		return "pubform";
	}	
	/*
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object.  
	 */
	@RequestMapping(value = "/savePub", method = RequestMethod.POST)
	public String savePub(@ModelAttribute("pub") Pub pub) {
		daoP.savePub(pub);
		return "redirect:/viewpub";
	}
	/* It provides list of employees in model object */
	@RequestMapping("/viewpub")
	public String viewpub(Model m) {
		List<Pub> list = daoP.getPubs();
		m.addAttribute("list", list);
		return "viewpub";
	}
	/*
	  It displays object data into form for the given id. The @PathVariable puts
	  URL data into variable.
	 */
	@RequestMapping(value = "/editpub/{id}")
	public String editPub(@PathVariable int id, Model m) {
		Pub pub = daoP.getPubById(id);
		m.addAttribute("command", pub);
		return "pubeditform";
	}
	/* It updates model object. */
	@RequestMapping(value = "/editsavePub", method = RequestMethod.POST)
	public String editsavePub(@ModelAttribute("pub") Pub pub) {
		daoP.updatePub(pub);
		return "redirect:/viewpub";
	}
	/* It deletes record for the given id in URL and redirects to /viewpub */
	@RequestMapping(value = "/deletepub/{id}", method = RequestMethod.GET)
	public String deletePub(@PathVariable int id) {
		daoP.deletePub(id);
		return "redirect:/viewpub";
	}


}
