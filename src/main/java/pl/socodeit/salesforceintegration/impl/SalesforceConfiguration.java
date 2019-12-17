package pl.socodeit.salesforceintegration.impl;

import lombok.Value;
import lombok.experimental.NonFinal;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Value
@NonFinal
@ConstructorBinding
@ConfigurationProperties(prefix = "salesforce.jwt")
@Validated
public class SalesforceConfiguration {

    @NotBlank
    String clientId;

    @NotBlank
    String subject;

    @NotBlank
    String audience;

    @Min(1)
    Integer expirationInMinutes;

}
