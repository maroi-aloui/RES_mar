package Archit;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class SimpleRestServiceApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {
		
		// Create a router Restlet that routes each call to a
		Router router = new Router(getContext());
		router.attach("/<add your restful service class name here>", SimpleRestService.class);
		router.attach("/<add your restful service class name here>/{request}", SimpleRestService.class);
		return router;
	}
}
