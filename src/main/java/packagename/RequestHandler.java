package main.java.packagename;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.json.*;


// N.B: Do not put a main function here, it can't be run.

@Path("/")
public class RequestHandler
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloWorld()
	{
		JsonObject obj = Json.createObjectBuilder().add("hello", "world").build();
		return Response.ok(obj).build();
	}


	@GET
	@Path("get/{param}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response answerGETrequest(@PathParam("param") String request)
	{
		String answer = "GET answer: " + request;
		return Response.ok(answer).build();
	}


	@POST
	@Path("post")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Response answerPOSTrequest(String request)
	{
		String answer = "POST answer: " + request;
		return Response.ok().entity(answer).build(); // alternative syntax
	}


	@GET
	@Path("file")
	@Produces(MediaType.TEXT_PLAIN)
	public Response answerFileRequest()
	{
		String filename = "some_text_file.txt";
		// String filename = "not_existing_file.txt";

		String content = FileContent.read(filename);
		String answer = "File content: " + content; // all '\n' are ignored!

		// Equivalent to 404 / 200:
		Response.Status status = content == null ? Response.Status.NOT_FOUND : Response.Status.OK;
		return Response.status(status).entity(answer).build();
	}
}
