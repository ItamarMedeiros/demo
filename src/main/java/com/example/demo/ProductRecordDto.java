package com.example.demo;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRecordDto(@NotBlank String name,@NotNull BigDecimal value) {

}
