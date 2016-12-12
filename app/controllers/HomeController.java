package controllers;

import java.util.List;

import models.Platoalacarta;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

       public Result index() {
    	   List<Platoalacarta> computadoras=Platoalacarta.listadoPlatos();
    	   
        return ok(index.render(Platoalacarta.listadoPlatos()));
    }

}
