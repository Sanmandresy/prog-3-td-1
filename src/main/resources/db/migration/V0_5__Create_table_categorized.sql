create table categorized
(
    id_book     int not null,
    constraint "book__fk" foreign key ("id_book")
        references book ("id"),
    id_category int not null,
    constraint "book_fk" foreign key ("id_category")
        references category ("id")
);