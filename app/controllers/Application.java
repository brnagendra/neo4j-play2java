package controllers;

import com.google.inject.Inject;
import org.neo.services.ImportService;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller {

    @Inject
    private ImportService importService;

    public Result index() {

        return ok(index.render("Your new application is ready."));
    }





}
