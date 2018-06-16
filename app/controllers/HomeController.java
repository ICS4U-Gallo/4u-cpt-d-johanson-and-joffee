package controllers;

import models.Marks;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Inject
    FormFactory formFactory;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        Form<Marks> marksForm = formFactory.form(Marks.class);
        return ok(views.html.index.render(marksForm));
    }
    public Result calculation() {
        Form<Marks> marksForm = formFactory.form(Marks.class);
        return ok(views.html.calculation.render(marksForm));
    }
}
