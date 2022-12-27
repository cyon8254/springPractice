package com.example.advanced.entity.car;

import com.example.advanced.embeddable.Address;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TBL_CAR_OWNER")
@Getter
@Setter
@ToString
public class CarOwner {
    @Id
    @GeneratedValue
    private Long carOwnerId;

    private String carOwnerName;
    String carOwnerAge;
    @Embedded
    private Address address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "carOwner")
    private List<CarRegistration> carRegistrations;
}
