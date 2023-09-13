package org.jsp.jpa.entity;

import java.io.Serializable;

import javax.persistence.*;
/**
 * The persistent class for the bookinfo database table.
 * 
 */
@Entity
@NamedQuery(name="Bookinfo.findAll", query="SELECT b FROM Bookinfo b")
public class Bookinfo implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	private String bookTitle;
	private String authorName;
	private int bookId;
	private int bookPages;
	private int bookPrice;
	public Bookinfo() 
	{
	}
	public String getBookTitle() 
	{
		return this.bookTitle;
	}
	public void setBookTitle(String bookTitle) 
	{
		this.bookTitle = bookTitle;
	}
	public String getAuthorName() 
	{
		return this.authorName;
	}
	public void setAuthorName(String authorName) 
	{
		this.authorName = authorName;
	}
	public int getBookId() 
	{
		return this.bookId;
	}
	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}
	public int getBookPages() 
	{
		return this.bookPages;
	}
	public void setBookPages(int bookPages) 
	{
		this.bookPages = bookPages;
	}
	public int getBookPrice() 
	{
		return this.bookPrice;
	}
	public void setBookPrice(int bookPrice) 
	{
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() 
	{
		return "Bookinfo [bookTitle=" + bookTitle + ", authorName=" + authorName + ", bookId=" + bookId + ", bookPages="
				+ bookPages + ", bookPrice=" + bookPrice + "]";
	}
}