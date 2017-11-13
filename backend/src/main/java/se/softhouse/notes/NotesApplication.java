package se.softhouse.notes;

import com.bazaarvoice.dropwizard.assets.ConfiguredAssetsBundle;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;
import se.softhouse.notes.db.NoteDAO;
import se.softhouse.notes.resources.NoteResource;
import se.softhouse.notes.services.NoteService;
import se.softhouse.notes.services.impl.NoteServiceDbImpl;

/**
 * @todo: this class should be renamed to 'MyProjectConfiguration' for your projects
 */
public class NotesApplication extends Application<NotesConfiguration> {
    @Override
    public void run(NotesConfiguration configuration, Environment environment) throws Exception {
        // setup database connection
        final DBI dbi = getDbiFor(configuration, environment);

        // data access objects
        final NoteDAO noteDAO = dbi.onDemand(NoteDAO.class);

        // create table
        noteDAO.createTable();

        // services
        final NoteService noteService = new NoteServiceDbImpl(noteDAO);

        // resources
        final NoteResource noteResource = new NoteResource(noteService);

        // environment
        environment.jersey().register(noteResource);
    }

    private DBI getDbiFor(NotesConfiguration configuration, Environment environment) {
        return new DBIFactory().build(environment, configuration.getDataSourceFactory(), "sqlite");
    }

    @Override
    public void initialize(Bootstrap<NotesConfiguration> configuration) {
        configuration.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "index.html"));
    }

    public static void main(String[] args) throws Exception {
        new NotesApplication().run(args);
    }
}
