package com.irostub.portfolio;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RequiredArgsConstructor
@Service
public class ServerStatusCheckService {
    private final RestTemplate restTemplate;

    private static HashMap<String, Boolean> serverStatus = new HashMap<>();

    public void checkServerStatus() {
    }

    public static HashMap<String, Boolean> getServerStatus() {
        return serverStatus;
    }
}
