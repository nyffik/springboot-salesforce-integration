package pl.socodeit.salesforceintegration.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final SalesforceService facade;

    @GetMapping("test")
    String createLead() {
        return facade.createLead();
    }
}
