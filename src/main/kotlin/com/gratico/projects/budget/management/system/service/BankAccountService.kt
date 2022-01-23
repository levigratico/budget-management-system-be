package com.gratico.projects.budget.management.system.service

import com.gratico.projects.budget.management.system.dao.entity.BankAccount
import com.gratico.projects.budget.management.system.dao.repository.BankAccountRepository
import com.gratico.projects.budget.management.system.model.BankAccountRequest
import com.gratico.projects.budget.management.system.model.BankAccountResponse
import com.gratico.projects.budget.management.system.model.BankAccountsRequest
import com.gratico.projects.budget.management.system.model.BankAccountsResponse
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class BankAccountService(val bankAccountRepository: BankAccountRepository) {

    fun getBankAccounts(): BankAccountsResponse = BankAccountsResponse(bankAccountRepository.findAll())

    fun getBankAccount(id: UUID): BankAccountResponse = BankAccountResponse(bankAccountRepository.findById(id).orElse(null))

    fun addAccounts(request: BankAccountsRequest): BankAccountsResponse {
       val bankAccounts: List<BankAccount> = request.accounts.map { BankAccount(name = it.name, totalAmount = it.totalAmount) }

        return BankAccountsResponse(bankAccountRepository.saveAll(bankAccounts))
    }

    fun addAccount(request: BankAccountRequest): BankAccountResponse =
        BankAccountResponse(bankAccountRepository.save(BankAccount(name = request.name, totalAmount = request.totalAmount)))
}