package com.example.librarymanagetransactionsv.controller;

import com.example.librarymanagetransactionsv.dto.TransactionDto;
import com.example.librarymanagetransactionsv.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transaction/")
@CrossOrigin
@Slf4j
public class TransactionController {
    @Autowired
    private TransactionService service;
    @PostMapping("/add-transaction")
    public void addTransactionDetails(@RequestBody TransactionDto dto){
           log.info(dto.toString());
           System.out.println(dto);
           service.addTransactionDetails(dto);
    }
}
