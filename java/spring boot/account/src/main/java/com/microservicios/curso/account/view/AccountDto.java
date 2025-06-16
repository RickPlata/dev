package com.microservicios.curso.account.view;

import com.microservicios.curso.account.model.Card;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class AccountDto {

    private String accountNumber;

    private Integer productNumber;

    private String productName;

    private BigDecimal balance;

    private List<Card> cards;

    public AccountDto(String accountNumber, Integer productNumber, String productName, BigDecimal balance, List<javax.smartcardio.Card> cardsByAccountNumber) {
    }
}
