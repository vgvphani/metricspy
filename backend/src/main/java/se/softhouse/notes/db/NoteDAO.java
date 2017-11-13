package se.softhouse.notes.db;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.sqlobject.customizers.SingleValueResult;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;
import se.softhouse.notes.db.entity.Note;

import java.util.List;
import java.util.Optional;

@RegisterMapperFactory(BeanMapperFactory.class)
public interface NoteDAO {
    @SqlUpdate("CREATE TABLE IF NOT EXISTS `note`(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " + //
            "title VARCHAR(12) NOT NULL, " + //
            "text VARCHAR(255) NOT NULL)")
    void createTable();

    @SqlQuery("SELECT * FROM `note`")
    List<Note> selectAll();

    @SqlQuery("SELECT * FROM `note` WHERE id = :id")
    @SingleValueResult
    Optional<Note> get(@Bind("id") int id);

    @SqlUpdate("INSERT INTO `note` (title, text) VALUES(:title, :text)")
    void insert(@BindBean Note note);

    @SqlUpdate("UPDATE `note` SET title = :title, text = :text WHERE id = :id")
    void update(@BindBean Note note);

    @SqlUpdate("DELETE FROM `note` WHERE id = :id")
    void delete(@Bind("id") int id);
}
