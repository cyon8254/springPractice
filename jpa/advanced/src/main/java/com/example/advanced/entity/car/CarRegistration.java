package com.example.advanced.entity.car;

import com.example.advanced.entity.CarOwner;
import com.example.advanced.type.CarBrand;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_CAR_REGISTRATION")
@Getter
@Setter
@ToString
public class CarRegistration {
    @Id
    @GeneratedValue
    private Long carRegistrationId;

    private LocalDateTime carRegistrationRegisterDate;
    private LocalDateTime carRegistrationUpdateDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_OWNER_ID")
    private CarOwner carOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    private Car car;
}
