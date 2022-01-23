package com.gratico.projects.budget.management.system.model

import com.gratico.projects.budget.management.system.dao.entity.BankAccount

data class BankAccountsResponse(val accounts: List<BankAccount>)

data class BankAccountResponse(val account: BankAccount?)