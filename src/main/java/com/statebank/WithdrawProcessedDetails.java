package com.statebank;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WithdrawProcessedDetails {
     private Long accountNumber;
     private BigDecimal remainingBalance;
     private BigDecimal withdrawnAmount;
     private WithdrawStatus status;
}
