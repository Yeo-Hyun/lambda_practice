package org.doublem.service;

import org.doublem.model.Juice;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApiComposer {

    public List<Juice> juiceList(){
        List<String> itemCodes = this.targetItemsCodesFromDBMS(30);

        return itemCodes.stream()
                .parallel()
                .map(x -> searchJuice(x))
                .collect(Collectors.toList());
    }

    public Juice searchJuice(String queryParam){
        //1 번 호출시 1초 걸림
        try {
            Thread.sleep(1000); //1초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Juice.builder().name(queryParam).price(1000).build();
    }

    public List<String> targetItemsCodesFromDBMS(int maxSize){
        List<String> codes = new ArrayList<>();

        for(int i = 0 ; i<maxSize; i++){
            codes.add(LocalDateTime.now().toString() +"/"+i);
        }

        return codes;
    }
}
