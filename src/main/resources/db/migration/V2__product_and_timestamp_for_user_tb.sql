CREATE TABLE product
(
    id        BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    title     VARCHAR(255)                            NOT NULL,
    price     DECIMAL                                 NOT NULL,
    published BOOLEAN                                 NOT NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

CREATE TABLE "user"
(
    id         BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name       VARCHAR(255),
    password   VARCHAR(255),
    email      VARCHAR(255),
    created_at TIMESTAMP WITHOUT TIME ZONE,
    updated_at TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

ALTER TABLE "user"
    ADD CONSTRAINT uc_user_email UNIQUE (email);