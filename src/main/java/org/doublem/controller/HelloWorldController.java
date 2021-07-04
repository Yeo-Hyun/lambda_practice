package org.doublem.controller;

import org.doublem.model.HelloWorldDto;
import org.doublem.model.Juice;
import org.doublem.service.ApiComposer;
import org.doublem.service.HelloWorldService;
import org.doublem.service.MangoInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    private MangoInterface helloWorldService;
    private ApiComposer apiComposer;

    public HelloWorldController(MangoInterface helloWorldService, ApiComposer apiComposer) {
        this.helloWorldService = helloWorldService;
        this.apiComposer = apiComposer;
    }

    @GetMapping("/hello")
    public HelloWorldDto getHelloWorld(){

        return helloWorldService.generate("Hello", "2", "2", "1");
    }

    @GetMapping("/juices")
    public List<Juice> getJuice(){
        return apiComposer.juiceList();
    }

}
