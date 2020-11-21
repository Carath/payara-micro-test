package packagename;

import jakarta.json.Json;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;


@Path("/")
public class RequestHandler
{
	@GET
	public Response helloWorld()
	{
		return Response.ok(Json.createObjectBuilder().add("hello", "world").build()).build();
	}


	@GET
	@Path("get/{param}")
	public Response answerGETrequest(@PathParam("param") String request)
	{
		String answer = "GET answer: " + request;
		return Response.ok(answer).build();
	}


	@POST
	@Path("post")
	// @Consumes(MediaType.TEXT_PLAIN)
	// @Produces(MediaType.TEXT_PLAIN)
	public Response answerPOSTrequest(String request)
	{
		String answer = "POST answer: " + request;
		return Response.ok().entity(answer).build(); // alternative syntax
	}
}
