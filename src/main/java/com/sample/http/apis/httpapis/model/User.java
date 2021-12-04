package com.sample.http.apis.httpapis.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    String name;
    int id;
}
