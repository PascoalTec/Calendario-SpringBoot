package dev.pascoaltec.contentcalendar.model;


import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;


public record Content(
    @Id
    Integer id,
    @NotBlank
    String title,
    String desc,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url
    ){

    }
