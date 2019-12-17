package pl.socodeit.salesforceintegration.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@AllArgsConstructor
@Value
public class Lead {

    String company;

    String lastName;
}
