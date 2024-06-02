package com.example.librarymanagetransactionsv.service.Impl;

import com.example.librarymanagetransactionsv.dto.TransactionDto;
import com.example.librarymanagetransactionsv.entity.TransactionEntity;
import com.example.librarymanagetransactionsv.repository.TransactionRepo;
import com.example.librarymanagetransactionsv.service.TransactionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void addTransactionDetails(TransactionDto dto) {
             transactionRepo.save(modelMapper.map(dto, TransactionEntity.class));
    }
}
