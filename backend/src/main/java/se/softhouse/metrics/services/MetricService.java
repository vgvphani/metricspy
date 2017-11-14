package se.softhouse.metrics.services;

import se.softhouse.metrics.db.entity.Metric;

import java.util.List;

public interface MetricService {
    List<Metric> getMetric();

    void createMetric(Metric metric);

    Metric getMetricBy(int id);

    void updateMetric(Metric metric);

    void deleteMetricBy(int id);
}
