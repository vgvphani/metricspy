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

    public MetricResource() {

        metricList = new ArrayList<>();
        id = new AtomicLong();
    }
// post method is to accept the metrics from python script in JSON
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addMetric(Metric newMetric){
        newMetric.setId(id.incrementAndGet());
        metricList.add(newMetric);
    }
// Get method to return the collected metrics
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Metric> getMetricList(){
        return metricList;
    }
}