package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import org.neo.models.Student;
import org.neo.services.StudentService;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by nagendra on 8/29/2015.
 */
public class StudentController extends Controller {

    @Inject
    private StudentService studentService;

    @BodyParser.Of(BodyParser.Json.class)
    public Result create() {
        JsonNode data = request().body().asJson();
        Student student = Json.fromJson(data, Student.class);
        return ok(Json.toJson(student));
    }
}
