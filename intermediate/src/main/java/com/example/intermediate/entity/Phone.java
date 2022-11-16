package com.example.intermediate.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("PHONE")
@Table(name = "TBL_PHONE")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Phone extends Computer {
    @Column(name = "PHONE_BATTERY")
    private String phoneBattery;

    public void create(String computerScreen, String computer_brand, String computerName, Long computerPrice, LocalDateTime computerReleaseDate, String computerRam, String computerSsd, String computerGpu, String computerProcessor, LocalDateTime computerCreatedDate, LocalDateTime computerUpdatedDate, String phoneBattery) {
        super.create(computerScreen, computer_brand, computerName, computerPrice, computerReleaseDate, computerRam, computerSsd, computerGpu, computerProcessor, computerCreatedDate, computerUpdatedDate);
        this.phoneBattery = phoneBattery;
    }
}