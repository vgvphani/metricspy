package se.example2.softhouse;

import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import se.example2.softhouse.Data.MetricResource;
import se.example2.softhouse.Note.NoteResource;

/**
 * Created by hxs on 2016-08-16.
 */
public class MetricSpyApplication extends Application<MetricSpyConfiguration> {

    @Override
    public void run(MetricSpyConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new MetricResource());
       // environment.jersey().register(new NoteResource());
    }

    @Override
    public void initialize(Bootstrap<MetricSpyConfiguration> configuration) {
       configuration.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "index.html"));
    }

    public static void main(String[] args) throws Exception {
        new MetricSpyApplication().run(args);
    }
}