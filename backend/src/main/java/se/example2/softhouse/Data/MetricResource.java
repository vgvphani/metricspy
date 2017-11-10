package se.example2.softhouse.Data;

import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Path("/metric")
public class MetricResource {

    private List<Metric> metricList;
    private AtomicLong id;

    public MetricResource(Metric defaultMetric) {

        metricList = new ArrayList<>();
        id = new AtomicLong();
        defaultMetric.setId(id.incrementAndGet());
        metricList.add(defaultMetric);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addMetric(Metric newMetric){
        newMetric.setId(id.incrementAndGet());
        metricList.add(newMetric);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Metric> getMetricList(){
        return metricList;
    }
}