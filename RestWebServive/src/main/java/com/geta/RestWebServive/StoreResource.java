package com.geta.RestWebServive;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Book")
public class StoreResource {

	StoreData data=new StoreData();

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Store> getAliens() {


		return data.getBookDetails();
	}

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("book/{title}")
	public Store getAlien(@PathParam("title") String title) {
		return data.getBookDetailByTitle(title);

	}

	@POST
	@Path("book")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Store createBook(Store s) {

		data.createBook(s);
		return s;
	}
	
	@PUT
	@Path("updateBookDetail")
	@Consumes({MediaType.APPLICATION_ATOM_XML,MediaType.APPLICATION_JSON})
	public Store updateBy(Store s) {

	data.updateBookDetail(s);
	return s;
	}

	@DELETE
	@Path("deleteById/{id}")
	public void deleteById(@PathParam("id")int id) {

	data.deleteBookDetail(id);
	}

	@DELETE
	@Path("deleteall")
	public void deleteAllBook() {

	data.deleteAllBook();
	}

}