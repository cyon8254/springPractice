package com.example.ex00.dependency;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@ToString
@RequiredArgsConstructor

public class Restaurant {
    public final Chef chef;
}
