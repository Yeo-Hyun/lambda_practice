package org.doublem.service;

import org.doublem.model.HelloWorldDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class HelloWorldService implements MangoInterface{

    public HelloWorldDto generate(String msg){
        return new HelloWorldDto(msg, 1);
    }

    public HelloWorldDto generate(String ... msg){

        String[] result = Arrays.stream(msg)
                                .filter((elements) -> !elements.equals("2"))
                                .toArray(String[]::new);

        return new HelloWorldDto(Arrays.toString(result), 1);
    }

}
