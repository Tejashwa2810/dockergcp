package com.example.dockergcp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DockerService {

    public String getTextForDocker(){
        log.info("Method getting Started-------------------");
        return "Hey there, I am Learning Docker";
    }
}
