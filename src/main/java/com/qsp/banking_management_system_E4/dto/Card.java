package com.qsp.banking_management_system_E4.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cardId;
	private String cardType;
	private String cardName;
	private long cardNumber;
	private double cardLimit;

}
