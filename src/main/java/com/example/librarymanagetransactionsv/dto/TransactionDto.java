package com.example.librarymanagetransactionsv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private Long id;
    private String userId;
    private List<Long> booksId;
    private List<String> booksIsbn;
    private String userEmail;
    private String userPhoneNum;
    private String date;
}
