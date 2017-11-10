package se.example2.softhouse;

import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import se.example2.softhouse.Data.MetricResource;

/**
 * Created by hxs on 2016-08-16.
 */
public class SystemUsage extends Application<SystemUsageConfiguration> {

    @Override
    public void run(SystemUsageConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new MetricResource(configuration.getDefaultMetric()));
    }

    @Override
    public void initialize(Bootstrap<SystemUsageConfiguration> configuration) {
       configuration.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "index.html"));
    }

    public static void main(String[] args) throws Exception {
        new SystemUsage().run(args);
    }
}
