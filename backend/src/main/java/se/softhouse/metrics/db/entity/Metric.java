package se.softhouse.metrics.db.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Metric {

    @JsonProperty
    private int id;

    @JsonProperty
    private String hostname;

    @JsonProperty
    private Long memoryUsage;

    @JsonProperty
    private float diskUsage;

    @JsonProperty
    private float cpuUsage;


    public Metric() {

    }

    public Metric(int id, String hostname, Long memoryUsage, float diskUsage, float cpuUsage) {
        this.id = id;
        this.hostname = hostname;
        this.memoryUsage = memoryUsage;
        this.diskUsage = diskUsage;
        this.cpuUsage = cpuUsage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public long getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(long memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public float getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(float diskUsage) {
        this.diskUsage = diskUsage;
    }

    public float getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(float cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "id=" + id +
                ", hostname='" + hostname + '\'' +
                ", memoryUsage='" + memoryUsage + '\'' +
                ", diskUsage='" + diskUsage + '\'' +
                ", cpuUsage='" + cpuUsage + '\'' +
                '}';
    }
}
