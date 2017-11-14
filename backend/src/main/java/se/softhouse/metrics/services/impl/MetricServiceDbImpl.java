package se.softhouse.metrics.services.impl;

import se.softhouse.metrics.db.MetricDAO;
import se.softhouse.metrics.db.entity.Metric;
import se.softhouse.metrics.exceptions.MetricExceptions;
import se.softhouse.metrics.services.MetricService;

import java.util.List;

public class MetricServiceDbImpl implements MetricService {
    private final MetricDAO metricDAO;

    public MetricServiceDbImpl(MetricDAO metricDAO) {
        this.metricDAO = metricDAO;
    }

    @Override
    public List<Metric> getMetric() {
        return metricDAO.selectAll();
    }

    @Override
    public void createMetric(Metric metric) {
        metricDAO.insert(metric);
    }

    @Override
    public Metric getMetricBy(int id) {
        return metricDAO.get(id).orElseThrow(MetricExceptions.NOT_FOUND);
    }

    @Override
    public void updateMetric(Metric metric) {
        metricDAO.update(metric);
    }

    @Override
    public void deleteMetricBy(int id) {
        metricDAO.delete(id);
    }
}
