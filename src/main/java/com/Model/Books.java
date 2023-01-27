package com.Model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;

//public class Books {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

//mark class as an Entity   
@Entity
//defining class name as Table name  
@Table
public class Books  
{  
//Defining book id as primary key  
@Id  
@Column  
private int bookid;  
@Column  
private String bookname;  
@Column  
private String author;  
@Column  
private int price;  
public int getBookid()   
{  
return bookid;  
}  
public void setBookid(int bookid)   
{  
this.bookid = bookid;  
}

/**
 * @return the bookname
 */
public String getBookname() {
	return bookname;
}
/**
 * @param bookname the bookname to set
 */
public void setBookname(String bookname) {
	this.bookname = bookname;
}
/**
 * @return the author
 */
public String getAuthor() {
	return author;
}
/**
 * @param author the author to set
 */
public void setAuthor(String author) {
	this.author = author;
}
/**
 * @return the price
 */
public int getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(int price) {
	this.price = price;
}  
}


