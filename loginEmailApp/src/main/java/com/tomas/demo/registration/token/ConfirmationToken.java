package com.tomas.demo.registration.token;

import com.tomas.demo.user.AppUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConfirmationToken {

    @SequenceGenerator(
            name = "confirmationToken_sequence_generator",
            sequenceName = "confirmationToken_sequence_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "confirmationToken_sequence_generator"
    )
    @Id
    private Long id;
    @Column(nullable = false)
    private String token;
    @Column(nullable = false)
    private LocalDate createdAt;
    @Column (nullable = false)
    private LocalDate expiresAt;
    private LocalDate confirmedAt;

    @ManyToOne //muchos {clase en la que estoy} con un {clase despues de anotacion}
    @JoinColumn(
            nullable = false,
            name = "user_id"
    )
    private AppUser appUser;

    public ConfirmationToken(String token, LocalDate createdAt, LocalDate expiresAt, LocalDate confirmedAt, AppUser appUser) {
        this.token = token;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.confirmedAt = confirmedAt;
        this.appUser = appUser;
    }
}
