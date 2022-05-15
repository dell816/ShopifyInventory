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
import com.ad.dao.BookDao;


@Controller
public class BookController {
	
	@Autowired
	BookDao dao;
	
	/*
	 It displays a form to input data, here "command" is a reserved request
	 attribute which is used to display object data into form
	 */
	@RequestMapping("/bookform")
	public String showform(Model m) {
		m.addAttribute("command", new Book());
		return "bookform";
	}	
	
	/*
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object. I need to mention RequestMethod.POST
	 */
	@RequestMapping(value = "/saveBook", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") Book book) {
		dao.saveBook(book);
		return "redirect:/viewbook";// will redirect to viewbook request mapping
	}
	
	/* It provides list of employees in model object */
	@RequestMapping("/viewbook")
	public String viewbook(Model m) {
		List<Book> list = dao.getBooks();
		m.addAttribute("list", list);
		return "viewbook";
	}
	
	/*
	  It displays object data into form for the given id. The @PathVariable puts
	  URL data into variable.
	 */
	@RequestMapping(value = "/editbook/{id}")
	public String editBook(@PathVariable int id, Model m) {
		Book book = dao.getBookById(id);
		m.addAttribute("command", book);
		return "bookeditform";
	}
	/* It updates model object. */
	@RequestMapping(value = "/editsaveBook", method = RequestMethod.POST)
	public String editsaveBook(@ModelAttribute("book") Book book) {
		dao.updateBook(book);
		return "redirect:/viewbook";
	}
	
	/* It deletes record for the given id in URL and redirects to /viewbook */
	@RequestMapping(value = "/deletebook/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable int id) {
		dao.deleteBook(id);
		return "redirect:/viewbook";
	}


}
