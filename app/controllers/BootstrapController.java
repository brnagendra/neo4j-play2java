package controllers;

import com.google.inject.Inject;
import org.neo.services.ImportService;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by nagendra on 8/25/2015.
 */
public class BootstrapController extends Controller {
    @Inject
    private ImportService importService;

    public Result bootstrap() {
        importService.reload();
        return ok("Import success");
    }
}
