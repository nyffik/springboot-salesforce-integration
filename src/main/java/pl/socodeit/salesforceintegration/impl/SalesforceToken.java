package pl.socodeit.salesforceintegration.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;


@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class SalesforceToken {

    @JsonProperty("access_token")
    String accessToken;

    @JsonProperty("instance_url")
    String instanceUrl;



}
