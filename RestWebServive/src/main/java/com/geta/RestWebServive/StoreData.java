package com.geta.RestWebServive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StoreData {

	Connection con=null;
	
	/*
	 * Method to connect data base.
	 */
	public StoreData()
	{
		String url= "jdbc:mysql://localhost:3306/book_store";
		String username="root";
		String password="mainroot";		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}

	/*
	 * method to insert a book detail.
	 */
	public void createBook(Store s)
	{
		String sql= "insert into bookDetails values(?,?,?,?,?)";
		try
		{
			PreparedStatement st=con.prepareStatement(sql);
			st.setInt(1, s.getBookID());
			st.setString(2, s.getTitle());
			st.setString(3, s.getAuthor());
			st.setString(4, s.getPublisher());
			st.setInt(5, s.getPublishedYear());

			st.executeUpdate();
		
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	/*
	 * method to get all book details
	 */
	public List<Store> getBookDetails()
	{
		List<Store> items= new ArrayList<Store>();
		String sql= "select * from bookDetails";
		try
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Store book = new Store();
				book.setBookID(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPublishedYear(rs.getInt(5));

				items.add(book);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return items;
	}

	/*
	 * method to get book by its title. 
	 */
	public Store getBookDetailByTitle(String title)
	{
		Store book = new Store();
		String sql= "select * from bookDetails where Title='"+title+"'" ;
		try
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {

				book.setBookID(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPublishedYear(rs.getInt(5));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return book;
	}

	/*
	 * method to update book detail by title and published year.
	 */
	public void updateBookDetail(Store s)
	{
		String sql= "update bookDetails set bookId=?,writer=?,publisher=? where title=? and publishedYear=? ";
		try 
		{
			PreparedStatement st=con.prepareStatement(sql);
			ResultSet rs = st.executeQuery(sql);
			s.setBookID(rs.getInt(1));
			s.setAuthor(rs.getString(2));
			s.setPublisher(rs.getString(4));

			st.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	/*
	 * method to delete a book by its ID.
	 */
	public void deleteBookDetail(int bookID) 
	{
		String sql= "delete from bookDetails where bookID="+bookID;
		try 
		{
			PreparedStatement st=con.prepareStatement(sql);

			st.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	/*
	 * method to delete all books.
	 */
	public void deleteAllBook()
	{
		String sql= "delete from bookstore";
		try
		{
			PreparedStatement st=con.prepareStatement(sql);

			st.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}

