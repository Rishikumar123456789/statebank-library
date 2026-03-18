package com.statebank;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepositEvent {
   private Long accountNumber;
   private String accountHolderName;
   private BigDecimal depositAmount;
}
