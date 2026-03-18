package com.statebank;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Deposit {
 private Long AccountNumber;
 private String accountHolderName;
 private BigDecimal depositAmount;
}
