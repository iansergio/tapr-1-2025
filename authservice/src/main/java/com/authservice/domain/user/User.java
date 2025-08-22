package com.authservice.domain.user;

import java.util.UUID;

import com.authservice.domain.user.vo.Email;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "tb_user")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {
    
    @Id
    @Column(nullable = false, updatable = false) 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Valid
    @Embedded
    private Email email;
}
