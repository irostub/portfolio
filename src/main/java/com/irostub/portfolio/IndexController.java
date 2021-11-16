package com.irostub.portfolio;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final ServerStatusCheckService serverStatusCheckService;

    @GetMapping(value = {"/index", "/"})
    public String index() {
        return "index";
    }
}
