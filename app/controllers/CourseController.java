package controllers;

import play.mvc.*;
import models.Course;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Set;
import javax.inject.Inject;

public class CourseController extends Controller {

    @Inject
    FormFactory formFactory;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result add() {
        Form<Course> courseForm = formFactory.form(Course.class);
        return ok(views.html.CourseCreate.render(courseForm));
    }
    public Result save(){
        Form<Course> courseForm = formFactory.form(Course.class).bindFromRequest();
        /*Form<Book> bookForm = formFactory.form(Book.class).bindFromRequest();
        Book book = bookForm.get();
        Book.add(book);*/
        return redirect(routes.HomeController.index());
    }

}