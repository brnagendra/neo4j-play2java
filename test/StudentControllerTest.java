import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import org.neo.models.Student;
import play.libs.Json;
import play.mvc.Result;
import play.test.WithApplication;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static play.test.Helpers.*;

/**
 * Created by nagendra on 8/29/2015.
 */
public class StudentControllerTest extends WithApplication {

    @Test
    public void testGetUser() {
        Student student = new Student();
        student.setName("My Test");
        JsonNode jsonNode = Json.toJson(student);
        Result result = route(fakeRequest(POST, "/student").bodyJson(jsonNode));
        assertNotNull(result);
        assertEquals(200, result.status());
        System.out.println(result.toString());
    }
}
