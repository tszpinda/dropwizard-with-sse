package org.ahedstrom.example;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class ExampleApp extends Application<Configuration> {

    @Override
    public void initialize(final Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/static"));
        bootstrap.addBundle(new ViewBundle<Configuration>());
    }
    @Override
    public void run(Configuration configuration, Environment env) throws Exception {

        final JerseyEnvironment jersey = env.jersey();

        jersey.register(new Resource());
        jersey.register(new WebsiteResource());
        
        env.getApplicationContext().getServletHandler().addServletWithMapping(SseEventSourceServlet.class, "/sse");
    }

    public static void main(String[] args) throws Exception {
        new ExampleApp().run(args);
    }
}
