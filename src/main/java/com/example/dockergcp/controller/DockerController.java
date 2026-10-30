package com.example.dockergcp.controller;

import com.example.dockergcp.service.DockerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
    private DockerService dockerService;

    public DockerController(DockerService dockerService){
        this.dockerService = dockerService;
    }

    @GetMapping("/gettext")
    public String getTextForDocker(){
        return dockerService.getTextForDocker();
    }
}
