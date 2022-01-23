package com.gratico.projects.budget.management.system.dao.entity

import java.time.OffsetDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "bank_account_tbl")
class BankAccount(
    id: UUID? = null,
    createdDate: OffsetDateTime? = OffsetDateTime.now(),
    updatedDate: OffsetDateTime? = OffsetDateTime.now(),

    @NotNull
    val name: String?,

    @Column(name = "total_amount")
    val totalAmount: Double?
): AbstractEntity(id, createdDate, updatedDate)