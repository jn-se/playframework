/*
 * Copyright (C) 2009-2013 Typesafe Inc. <http://www.typesafe.com>
 */
package javaguide.tests.controllers;

import play.mvc.*;

public class Application extends Controller {

    public static Result index(String name) {
        return ok(javaguide.tests.html.index.render(name));
    }
}
