package com.gratico.projects.budget.management.system.controller

import com.gratico.projects.budget.management.system.model.BankAccountRequest
import com.gratico.projects.budget.management.system.model.BankAccountResponse
import com.gratico.projects.budget.management.system.model.BankAccountsRequest
import com.gratico.projects.budget.management.system.model.BankAccountsResponse
import com.gratico.projects.budget.management.system.service.BankAccountService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/banks")
class BankAccountController(val bankAccountService: BankAccountService) {

    @GetMapping("/accounts")
    fun getBankAccounts(): BankAccountsResponse = bankAccountService.getBankAccounts()

    @GetMapping("/accounts/{id}")
    fun getBankAccount(@PathVariable id: UUID): BankAccountResponse = bankAccountService.getBankAccount(id)

    @PostMapping("/accounts")
    fun addAccounts(@RequestBody request: BankAccountsRequest): BankAccountsResponse = bankAccountService.addAccounts(request)

    @PostMapping("/account")
    fun addAccount(@RequestBody request: BankAccountRequest): BankAccountResponse = bankAccountService.addAccount(request)
}