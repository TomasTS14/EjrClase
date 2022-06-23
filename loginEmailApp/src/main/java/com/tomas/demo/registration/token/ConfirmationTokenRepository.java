package com.tomas.demo.registration.token;

import com.fasterxml.jackson.annotation.OptBoolean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {

    @Query("Select t from confirmation_token t where token = ?1")
    Optional<ConfirmationToken> findByToken(String token);

    @Transactional
    @Modifying
    @Query(
            "UPDATE confirmation_token t" +
                    "SET t.confirmedAt=?2" + //este sería el segundo parametro del metodo a continuacion
                    "WHERE t.token = ?1" //este el primer parametro. POR ESO LO DE ?1 O ?2
    )
    int updateConfirmedAt(String token, LocalDateTime confirmedAt); //lo de devolver un int es para asegurar que funciona.

}
