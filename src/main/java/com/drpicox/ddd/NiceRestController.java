package com.drpicox.ddd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/nice")
public class NiceRestController {

    private NiceService niceService;

    public NiceRestController(NiceService niceService) {
        this.niceService = niceService;
    }

    @GetMapping
    public Boolean isNice() {
        return niceService.isNice();
    }
}
