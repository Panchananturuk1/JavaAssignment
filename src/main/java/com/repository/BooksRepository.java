package com.repository;

import org.springframework.data.repository.CrudRepository;  
import com.Model.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
	
}  