package com.cra.webservices.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {

    private static final long serialVersionUID = 5135749675626057511L;

    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
