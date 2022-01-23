package com.gratico.projects.budget.management.system.dao.repository

import com.gratico.projects.budget.management.system.dao.entity.BankAccount
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface BankAccountRepository: JpaRepository<BankAccount, UUID> {
}