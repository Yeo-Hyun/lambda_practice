package org.doublem.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Juice {
    private String name;
    private double price;
}
