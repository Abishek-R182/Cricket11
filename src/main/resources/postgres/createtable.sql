-- public.players definition

-- Drop table

-- DROP TABLE public.players;

CREATE TABLE public.players (
	player_age int4 NOT NULL,
	player_id uuid NOT NULL,
	batting_style varchar(255) NULL,
	bowling_style varchar(255) NULL,
	ipl_runs_scored varchar(255) NULL,
	ipl_wickets_taken varchar(255) NULL,
	odi_runs_scored varchar(255) NULL,
	odi_wickets_taken varchar(255) NULL,
	overall_international_runs_scored varchar(255) NULL,
	overall_international_wickets_taken varchar(255) NULL,
	player_country varchar(255) NULL,
	player_dob varchar(255) NULL,
	player_name varchar(255) NULL,
	player_role varchar(255) NULL,
	t20_runs_scored varchar(255) NULL,
	t20_wickets_taken varchar(255) NULL,
	test_runs_scored varchar(255) NULL,
	test_wickets_taken varchar(255) NULL,
	CONSTRAINT players_pkey PRIMARY KEY (player_id)
);



-- public.dream11 definition

-- Drop table

-- DROP TABLE public.dream11;

CREATE TABLE public.dream11 (
	player_age int4 NOT NULL,
	dream11_id uuid NULL,
	dream11user_id uuid NULL,
	id uuid NOT NULL,
	batting_style varchar(255) NULL,
	bowling_style varchar(255) NULL,
	player_country varchar(255) NULL,
	player_name varchar(255) NULL,
	CONSTRAINT dream11_pkey PRIMARY KEY (id)
);


-- public.dream11 foreign keys

ALTER TABLE public.dream11 ADD CONSTRAINT fk_dream11_id FOREIGN KEY (dream11_id) REFERENCES public.players(player_id);
ALTER TABLE public.dream11 ADD CONSTRAINT fk_dream11user_id FOREIGN KEY (dream11user_id) REFERENCES public.userdetails(user_id);
ALTER TABLE public.dream11 ADD CONSTRAINT fkd2tajwcvomymj3dqpsa425lk7 FOREIGN KEY (dream11_id) REFERENCES public.players(player_id);
ALTER TABLE public.dream11 ADD CONSTRAINT fkgtvhbktycwhpqalynb8p94na3 FOREIGN KEY (dream11user_id) REFERENCES public.userdetails(user_id);




-- public.pointstable definition

-- Drop table

-- DROP TABLE public.pointstable;

CREATE TABLE public.pointstable (
	points int4 NOT NULL,
	point_id uuid NOT NULL,
	point_dept varchar(255) NULL,
	CONSTRAINT pointstable_pkey PRIMARY KEY (point_id)
);





-- public.results definition

-- Drop table

-- DROP TABLE public.results;

CREATE TABLE public.results (
	player_id uuid NULL,
	result_id uuid NOT NULL,
	catch varchar(255) NULL,
	runout varchar(255) NULL,
	runs varchar(255) NULL,
	stumping varchar(255) NULL,
	total varchar(255) NULL,
	wickets varchar(255) NULL,
	user_id uuid NULL,
	CONSTRAINT results_pkey PRIMARY KEY (result_id),
	CONSTRAINT results_player_id_key UNIQUE (player_id)
);


-- public.results foreign keys

ALTER TABLE public.results ADD CONSTRAINT fk1pe4l7vvbtq19b0dwwarv7lf5 FOREIGN KEY (player_id) REFERENCES public.players(player_id);
ALTER TABLE public.results ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES public.userdetails(user_id);





-- public.userdetails definition

-- Drop table

-- DROP TABLE public.userdetails;

CREATE TABLE public.userdetails (
	user_id uuid NOT NULL,
	email varchar(255) NULL,
	phone_number varchar(255) NULL,
	user_name varchar(255) NULL,
	CONSTRAINT userdetails_pkey PRIMARY KEY (user_id)
);

