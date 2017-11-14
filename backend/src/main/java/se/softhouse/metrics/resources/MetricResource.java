package se.softhouse.metrics.resources;

import se.softhouse.metrics.db.entity.Metric;
import se.softhouse.metrics.services.MetricService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/metric")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MetricResource {
    private final MetricService metricService;

    public MetricResource(MetricService metricService) {
        this.metricService = metricService;
    }

    @GET
    public List<Metric> getNotes() {
        return metricService.getMetric();
    }

    @GET
    @Path("/{id}")
    public Metric getNote(@PathParam("id") int id) {
        return metricService.getMetricBy(id);
    }

    @PUT
    @Path("/{id}")
    public void UpdateMetric(@PathParam("id") int id, @Valid @NotNull Metric metric) {
        metric.setId(id);
        metricService.updateMetric(metric);
    }

    @POST
    public void createMetric(@Valid @NotNull Metric metric) {
        metricService.createMetric(metric);
    }

    @DELETE
    @Path("/{id}")
    public void deleteMetric(@PathParam("id") int id) {
        metricService.deleteMetricBy(id);
    }
}