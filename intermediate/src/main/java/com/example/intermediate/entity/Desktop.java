package com.example.intermediate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.awt.*;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("DESKTOP")
@Table(name = "TBL_DESKTOP")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Desktop extends Computer {
    @Column(name = "DESKTOP_KEYBOARD")
    private String desktop_keyboard;

    public void create(String computerScreen, String computer_brand, String computerName, Long computerPrice, LocalDateTime computerReleaseDate, String computerRam, String computerSsd, String computerGpu, String computerProcessor, LocalDateTime computerCreatedDate, LocalDateTime computerUpdatedDate, String desktop_keyboard) {
        super.create(computerScreen, computer_brand, computerName, computerPrice, computerReleaseDate, computerRam, computerSsd, computerGpu, computerProcessor, computerCreatedDate, computerUpdatedDate);
        this.desktop_keyboard = desktop_keyboard;
    }
}
