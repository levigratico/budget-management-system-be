CREATE SCHEMA IF NOT EXISTS budgetmanagementsystem;

CREATE TABLE bank_account_tbl (
    id              UUID            NOT NULL,
    name            VARCHAR(50)     NOT NULL,
    total_amount    DECIMAL(10, 2),
    created_date    DATETIME        NOT NULL,
    updated_date    DATETIME        NOT NULL,
    PRIMARY KEY(ID)
);

CREATE TABLE category_tbl (
    id              UUID        NOT NULL,
    priority        INT(2)      NOT NULL,
    name            VARCHAR(50) NOT NULL,
    created_date    DATETIME    NOT NULL,
    updated_date    DATETIME    NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE particulars_tbl (
    id              UUID        NOT NULL,
    name            VARCHAR(50) NOT NULL,
    category_id     UUID        NOT NULL,
    created_date    DATETIME    NOT NULL,
    updated_date    DATETIME    NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE bank_account_allocation_tbl (
    id              VARCHAR(100)   NOT NULL,
    bank_account_id UUID           NOT NULL,
    particulars_id  UUID           NOT NULL,
    budget_id       UUID,
    amount          DECIMAL(10, 2) NOT NULL,
    created_date    DATETIME       NOT NULL,
    updated_date    DATETIME       NOT NULL,
    active          BIT(1)         NOT NULL,
    PRIMARY KEY(id)
);