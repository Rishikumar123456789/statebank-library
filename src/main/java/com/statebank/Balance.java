package com.statebank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Balance {
	 private Long transactionId;
	 private Long  accountNumber;
	 private String name;
	 private Integer balance;
}
