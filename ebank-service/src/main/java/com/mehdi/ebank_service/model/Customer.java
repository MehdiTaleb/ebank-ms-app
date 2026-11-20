package com.mehdi.ebank_service.model;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Customer {
    private long id;
    private String name;
    private String email;
}
