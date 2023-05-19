package com.example.yokodspringbootbank;

import com.example.yokodspringbootbank.model.TransferBalance;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController("/balance")
public class BalanceController {

    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId) {

    }

    @PostMapping("/add")
    public BigDecimal addMoney(@RequestBody TransferBalance amount) {

    }

    @PostMapping("/transfer")
    public BigDecimal transfer(@RequestBody TransferBalance transferBalance) {

    }

}
