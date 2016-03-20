package scheduler;

import java.io.IOException;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value="Root")
@WebService
public class Root {
	
	public Root() {
		System.out.println("Created");
	}
	
	@POST
	@Consumes("text/plain")
	@Produces("text/plain")
	public String post(String s) throws IOException {
		
		if (ScheduleFunction.updateTime(s)) {
			return "Success";
		}
		
		return "Not Successful";
	}
}
