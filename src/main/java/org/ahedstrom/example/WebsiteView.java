package org.ahedstrom.example;

import io.dropwizard.views.View;

public class WebsiteView extends View {

    public WebsiteView() {
        super("index.ftl");
    }

}
