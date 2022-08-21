package com.springsecurity.spring_security_td.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name ="\"post\"")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private Instant postingDate;

    @Column(nullable = false)
    private String content;

    @ManyToOne
    private User user;
}
