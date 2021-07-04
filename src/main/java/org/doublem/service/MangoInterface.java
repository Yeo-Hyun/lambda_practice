package org.doublem.service;

import org.doublem.model.HelloWorldDto;

public interface MangoInterface {

    default String getMyName(){
        return "hahahah";
    }

    HelloWorldDto generate(String msg);

    HelloWorldDto generate(String ... msg);
}
