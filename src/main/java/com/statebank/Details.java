package com.statebank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Details {
	private Long accountNumber;
	private String name; 
	private String gender; 
	private Integer age; 
	private String accountType; 
	private Integer balance; 
}
