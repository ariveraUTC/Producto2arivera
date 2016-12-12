# --- First database schema

# --- !Ups

create table platoalacarta (
  id                        bigint not null,
  name                      varchar(255),
  precio                	varchar(100),
  fecha		              	timestamp,
  constraint pk_platoalacarta primary key (id))
;

create sequence platoalacarta_seq start with 1000;


# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists platoalacarta;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists platoalacarta_seq;

