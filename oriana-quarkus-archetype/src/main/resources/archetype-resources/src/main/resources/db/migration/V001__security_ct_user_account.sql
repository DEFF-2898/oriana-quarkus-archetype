CREATE TABLE IF NOT EXISTS security.user_account (
	id bigserial NOT NULL,
	is_active boolean NOT NULL DEFAULT true,
	username varchar(50) NOT NULL,
	password_hash text NOT NULL,
	person_id bigint NOT NULL,
	CONSTRAINT pk_user_account_id PRIMARY KEY (id),
	CONSTRAINT uq_user_account_username UNIQUE (username)
);
