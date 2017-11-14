package se.softhouse.metrics;

import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;
import se.softhouse.metrics.db.MetricDAO;
import se.softhouse.metrics.resources.MetricResource;
import se.softhouse.metrics.services.MetricService;
import se.softhouse.metrics.services.impl.MetricServiceDbImpl;

public class MetricSpyApplication extends Application<MetricSpyConfiguration> {
    @Override
    public void run(MetricSpyConfiguration configuration, Environment environment) throws Exception {
        // setup database connection
        final DBI dbi = getDbiFor(configuration, environment);

        // data access objects
        final MetricDAO metricDAO = dbi.onDemand(MetricDAO.class);

        // create table
        metricDAO.createTable();

        // services
        final MetricService metricService = new MetricServiceDbImpl(metricDAO);

        // resources
        final MetricResource metricResource = new MetricResource(metricService);

        // environment
        environment.jersey().register(metricResource);
    }

    private DBI getDbiFor(MetricSpyConfiguration configuration, Environment environment) {
        return new DBIFactory().build(environment, configuration.getDataSourceFactory(), "sqlite");
    }

    @Override
    public void initialize(Bootstrap<MetricSpyConfiguration> configuration) {
        configuration.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "index.html"));
    }

    public static void main(String[] args) throws Exception {
        new MetricSpyApplication().run(args);
    }
}