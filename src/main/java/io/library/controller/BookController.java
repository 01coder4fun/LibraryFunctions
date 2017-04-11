package io.library.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BooksService bookService;
	
	@RequestMapping("/booklist")
	public List<Books> getBookList()
	{
		return bookService.getBookList();
	}
	
	@RequestMapping("/booklist/{id}")
	public Books getBook( @PathVariable String id)
	{
		return bookService.getBook(id);	
	}
	
	@RequestMapping("/booklist/{author}")
	public Books getBookByAuthor( @PathVariable String author)
	{
		return bookService.getBookByAuthor(author);	
	}
	
	@RequestMapping("/booklist/{name}")
	public Books getBookByName( @PathVariable String name)
	{
		return bookService.getBookByName(name);	
	}
	
	@RequestMapping("/booklist/{genre}")
	public Books getBookByGenre( @PathVariable String genre)
	{
		return bookService.getBookByGenre(genre);	
	}

}
