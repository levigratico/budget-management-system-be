package com.gratico.projects.budget.management.system.model

data class BankAccountRequest(val name: String?, val totalAmount: Double?)

data class BankAccountsRequest(val accounts: List<BankAccountRequest>)