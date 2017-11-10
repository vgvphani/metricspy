package se.example2.softhouse;

import com.bazaarvoice.dropwizard.assets.AssetsBundleConfiguration;
import com.bazaarvoice.dropwizard.assets.AssetsConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import se.example2.softhouse.Data.Metric;
import se.example2.softhouse.Note.Note;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by hxs on 2016-08-16.
 */
public class SystemUsageConfiguration extends Configuration implements AssetsBundleConfiguration{

    private Metric defaultMetric;

    public Metric getDefaultMetric() {
        return defaultMetric;
    }

    @Valid
    @NotNull
    @JsonProperty
    private final AssetsConfiguration assets = new AssetsConfiguration();

    public AssetsConfiguration getAssetsConfiguration() {
        return assets;
    }
}
