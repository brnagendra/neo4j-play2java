package controllers;

import com.google.inject.Inject;
import org.neo.services.SchoolService;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by nagendra on 8/26/2015.
 */
public class SchoolController extends Controller {

    @Inject
    private SchoolService schoolService;

    public Result get() {
        return ok(Json.toJson(schoolService.findAll()));
    }
}
