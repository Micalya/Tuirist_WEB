CREATE DATABASE "Turist_Agency"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Russian_Russia.1251'
    LC_CTYPE = 'Russian_Russia.1251'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False
CREATE TABLE IF NOT EXISTS public.add_programs
(
    id_add_programs integer NOT NULL,
    program character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT add_programs_pkey PRIMARY KEY (id_add_programs)
)
CREATE TABLE IF NOT EXISTS public.city
(
    country_id integer,
    id_city integer NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT city_pkey PRIMARY KEY (id_city),
    CONSTRAINT city_country_id_key UNIQUE (country_id),
    CONSTRAINT fkrpd7j1p7yxr784adkx4pyepba FOREIGN KEY (country_id)
        REFERENCES public.country (id_country) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
CREATE TABLE IF NOT EXISTS public.country
(
    id_country integer NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT country_pkey PRIMARY KEY (id_country)
)
CREATE TABLE IF NOT EXISTS public.hotel
(
    city_id integer,
    id_hotel integer NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT hotel_pkey PRIMARY KEY (id_hotel),
    CONSTRAINT hotel_city_id_key UNIQUE (city_id),
    CONSTRAINT fkf1iabdv6bi2yohh9h48wce42x FOREIGN KEY (city_id)
        REFERENCES public.city (id_city) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
CREATE TABLE IF NOT EXISTS public.numbers
(
    hotel_id integer,
    id_numbers integer NOT NULL,
    "number" integer NOT NULL,
    type_numbers_id integer,
    CONSTRAINT numbers_pkey PRIMARY KEY (id_numbers),
    CONSTRAINT numbers_hotel_id_key UNIQUE (hotel_id),
    CONSTRAINT numbers_type_numbers_id_key UNIQUE (type_numbers_id),
    CONSTRAINT fkb4qmasmdqq19b0mcq8rdceux3 FOREIGN KEY (type_numbers_id)
        REFERENCES public.type_numbers (id_type_numbers) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fki5q4ugm9bfiufhga7jexb0j90 FOREIGN KEY (hotel_id)
        REFERENCES public.hotel (id_hotel) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
CREATE TABLE IF NOT EXISTS public.type_meals
(
    id_type_meals integer NOT NULL,
    type character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT type_meals_pkey PRIMARY KEY (id_type_meals)
)
CREATE TABLE IF NOT EXISTS public.type_numbers
(
    id_type_numbers integer NOT NULL,
    type character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT type_numbers_pkey PRIMARY KEY (id_type_numbers)
)
CREATE TABLE IF NOT EXISTS public.type_sending
(
    id_type_sending integer NOT NULL,
    type character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT type_sending_pkey PRIMARY KEY (id_type_sending)
)
CREATE TABLE IF NOT EXISTS public.type_voucher
(
    id_type_voucher integer NOT NULL,
    type character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT type_voucher_pkey PRIMARY KEY (id_type_voucher)
)
CREATE TABLE IF NOT EXISTS public.users
(
    id_user integer NOT NULL,
    login character varying(255) COLLATE pg_catalog."default",
    middlename character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    password character varying(255) COLLATE pg_catalog."default",
    surname character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT users_pkey PRIMARY KEY (id_user)
)
CREATE TABLE IF NOT EXISTS public.voucher
(
    add_programs_id integer,
    date_departure date,
    date_return date,
    id_voucher integer NOT NULL,
    numbers_id integer,
    price double precision NOT NULL,
    type_sending_id integer,
    type_voucher_id integer,
    description character varying(255) COLLATE pg_catalog."default",
    name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT voucher_pkey PRIMARY KEY (id_voucher),
    CONSTRAINT voucher_add_programs_id_key UNIQUE (add_programs_id),
    CONSTRAINT voucher_numbers_id_key UNIQUE (numbers_id),
    CONSTRAINT voucher_type_sending_id_key UNIQUE (type_sending_id),
    CONSTRAINT voucher_type_voucher_id_key UNIQUE (type_voucher_id),
    CONSTRAINT fk2fh0ovp70h2luhlpywirc1iov FOREIGN KEY (add_programs_id)
        REFERENCES public.add_programs (id_add_programs) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkboray8fdwrsnig377s2hlv4kj FOREIGN KEY (numbers_id)
        REFERENCES public.numbers (id_numbers) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkj8mv7s6q3a3bp1pcp5qrd3fo0 FOREIGN KEY (type_voucher_id)
        REFERENCES public.type_voucher (id_type_voucher) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkrokcmm1kxc65aa5dxemh4i2tn FOREIGN KEY (type_sending_id)
        REFERENCES public.type_sending (id_type_sending) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
