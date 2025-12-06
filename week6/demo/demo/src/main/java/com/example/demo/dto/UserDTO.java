package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NotFound;


@Setter
@Getter
public class UserDTO {

    private String name;
    private String email;

}
