package se.softhouse.metrics.db;

import com.sun.javafx.font.Metrics;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.sqlobject.customizers.SingleValueResult;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;
import se.softhouse.metrics.db.entity.Metric;

import java.util.List;
import java.util.Optional;

@RegisterMapperFactory(BeanMapperFactory.class)
public interface MetricDAO {
    @SqlUpdate("CREATE TABLE IF NOT EXISTS `metric`(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " + //
            "hostname VARCHAR(20) NOT NULL, " + //
            "Timestamp DATETIME DEFAULT CURRENT_TIMESTAMP NULL, " + //
            "memoryUsage REAL NOT NULL, " + //
            "diskUsage FLOAT(2,1) NOT NULL, " + //
            "cpuUsage FLOAT(2,1) NOT NULL)")
    void createTable();

   @SqlQuery("SELECT * FROM `metric` WHERE hostname = :name")
    List<Metric> select(@Bind("name") String name); //for info page(graphs)

    @SqlQuery("SELECT * FROM `metric` group by hostname order by id desc")
    List<Metric> selectAll();

    @SqlQuery("SELECT * FROM `metric` WHERE id = :id")
    @SingleValueResult
    Optional<Metric> get(@Bind("id") int id);

    @SqlUpdate("INSERT INTO `metric` (hostname, memoryUsage, diskUsage, cpuUsage) VALUES(:hostname, :memoryUsage, :diskUsage, :cpuUsage)")
    void insert(@BindBean Metric metric);

    @SqlUpdate("UPDATE `metric` SET hostname = :hostname, memoryUsage = :memoryUsage, diskUsage = :diskUsage, cpuUsage = :cpuUsage WHERE id = :id")
    void update(@BindBean Metric metric);

    @SqlUpdate("DELETE FROM `metric` WHERE id = :id")
    void delete(@Bind("id") int id);
}
