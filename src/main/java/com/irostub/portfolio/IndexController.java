package com.irostub.portfolio;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Controller
public class IndexController {
    private final ServerStatusCheckService serverStatusCheckService;
    private final RestTemplate restTemplate;

    @GetMapping(value = {"/index", "/"})
    public String index() {
        return "index";
    }

    @ResponseBody
    @PostMapping(value="/line")
    public ResponseEntity<Object> line(@ModelAttribute Line line) {
        DiscordMessage discordMessage = DiscordMessage.createMessage(line.getName(), line.getEmail(),line.getDesc());
        RequestEntity<DiscordMessage> request = RequestEntity.method(HttpMethod.POST, "https://discord.com/api/webhooks/910125733223997451/CMQqVvh6QA-X-k-f2GlQZscf2j4PrXKwoInzrTDioqzKY8cSoX6jHMKGEmP33yCYdrKN")
                .contentType(MediaType.APPLICATION_JSON)
                .body(discordMessage);
        return restTemplate.exchange(request, Object.class);
    }
}
