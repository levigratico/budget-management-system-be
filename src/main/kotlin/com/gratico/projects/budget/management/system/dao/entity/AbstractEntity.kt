package com.gratico.projects.budget.management.system.dao.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.OffsetDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.validation.constraints.NotNull

@MappedSuperclass
open class AbstractEntity(
    @Column(name = "id")
    @NotNull
    @Id
    @GeneratedValue
    val id: UUID?,

    @Column(name = "created_date")
    @NotNull
    @CreatedDate
    val createdDate: OffsetDateTime?,

    @Column(name = "updated_date")
    @NotNull
    @LastModifiedDate
    val updatedDate: OffsetDateTime?
)