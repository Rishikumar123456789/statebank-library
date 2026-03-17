package com.statebank;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountOpenedEvent {
   private Long accountNumber;
   private String name;
   private BigDecimal balance;
}
