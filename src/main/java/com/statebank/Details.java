package com.statebank;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Details {	
	private String name; 
	private String gender; 
	private Integer age; 
	private String accountType; 
	private BigDecimal balance; 
}
