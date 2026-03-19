package com.statebank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Withdraw {
private Long accountNumber;
private String accountHolderName;
private BigDecimal withDrawAmount;
private LocalDateTime withDrawDatetime;
}
