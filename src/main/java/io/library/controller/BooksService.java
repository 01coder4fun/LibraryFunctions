package io.library.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BooksService 
{
	List <Books> books = Arrays.asList
	(
new Books("01","pete the cat","bob","non fiction"),
new Books("02","carrot seed","linda","mystery"),
new Books("03","pete","eric","fiction"),
new Books("04","blood diamond","smith","non fiction"),
new Books("05","gaston","suess","fiction")
	);
	
public List<Books> getBookList(){
	return books;
}

public Books getBook(String id)
{
	return books.stream().filter(b -> b.getId().equals(id)).findFirst().get();	
}

public Books getBookByAuthor(String author)
{
	return books.stream().filter(b -> b.getAuthor().equals(author)).findFirst().get();	
}

public Books getBookByName(String name)
{
	return books.stream().filter(b -> b.getName().equals(name)).findFirst().get();	
}

public Books getBookByGenre(String genre)
{
	return books.stream().filter(b -> b.getGenre().equals(genre)).findFirst().get();	
}


}
