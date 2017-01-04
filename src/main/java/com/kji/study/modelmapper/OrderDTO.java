package com.kji.study.modelmapper;

import lombok.Data;

@Data
public class OrderDTO {
	  String customerFirstName;
	  String customerLastName;
	  String billingStreet;
	  String billingCity;
}
