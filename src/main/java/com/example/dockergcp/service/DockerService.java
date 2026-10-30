package com.example.dockergcp.service;

import org.springframework.stereotype.Service;

@Service
public class DockerService {

    public String getTextForDocker(){
        return "Hey there, I am Learning Docker";
    }
}
