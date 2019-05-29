package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class AsyncController extends Controller{

	public Result welcome(String name, String lastName) {
		return ok("welcome " + name + " " + lastName + " to your new controller...");
	}
}
