package com.example.test.controller;

import com.example.test.entity.AccountEntity;
import com.example.test.entity.BookEntity;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/account")
    public ResponseEntity account() {
        AccountEntity account = new AccountEntity();
        account.setBalance(1000);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/market")
    public ResponseEntity market() {
        BookEntity book = new BookEntity();
        book.setName("testname");
        book.setAuthor("testauthor");
        book.setAmount(3);
        book.setPrice(1000);
        return ResponseEntity.ok(book);
    }

}
