package com.sbczk.mcalsync.api.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/status")
    public Status getStatus() {
        return new Status();
    }
}
