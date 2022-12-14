package com.example.advanced.entity.car;

import com.example.advanced.type.CarBrand;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TBL_CAR")
@Getter
@Setter
@ToString
public class Car {
    @Id
    @GeneratedValue
    private Long carId;

    @Enumerated(EnumType.STRING)
    private CarBrand carBrand;
    private String carName;
    private String carColor;
    private Long carPrice;
    private LocalDateTime carReleaseDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "car")
    private List<CarRegistration> carRegistrations;

    public void create(CarBrand carBrand, String carName, String carColor, Long carPrice, LocalDateTime carReleaseDate, List<CarRegistration> carRegistrations) {
        this.carBrand = carBrand;
        this.carName = carName;
        this.carColor = carColor;
        this.carPrice = carPrice;
        this.carReleaseDate = carReleaseDate;
        this.carRegistrations = carRegistrations;
    }
}
