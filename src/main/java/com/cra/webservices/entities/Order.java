package com.cra.webservices.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "TB_ORDER")
@Getter @Setter
public class Order implements Serializable {

    private static final long serialVersionUID = -5223250568916149836L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-mm-dd'T'HH:mm:s'Z'", timezone = "GMT")
    private Instant instant;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {
    }

    public Order(Long id, Instant instant, User client){
        super();
        this.id = id;
        this.instant = instant;
        this.client = client;
    }
}
