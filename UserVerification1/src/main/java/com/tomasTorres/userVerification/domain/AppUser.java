package com.tomasTorres.userVerification.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @SequenceGenerator(name = "sequence_generator", sequenceName = "app_user_id", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String name;
    private String username;
    private String password;
    @ManyToMany(fetch = EAGER,
    targetEntity = Role.class)
    private Collection<Role> roles = new ArrayList<>();

}
