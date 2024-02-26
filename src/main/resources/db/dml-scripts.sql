INSERT INTO PRODUCT(PRODUCT_ID, NAME, PRICE, AMOUNT)
VALUES ('260f7043-d0bf-4d99-b143-6ee555685561', 'Iphone 12 mini', 299.0, 14),   -- id: 1
       ('260f7043-d0bf-4d99-b143-6ee555685560', 'Samsung S22', 222.0, 3), -- id: 2
       ('260f7043-d0bf-4d99-b143-6ee555685562', 'Iphone 14 Pro', 798.99, 5),
       ('260f7043-d0bf-4d99-b143-6ee555685563', 'Screen protector Samsung S2xx', 14.39, 79),
       ('260f7043-d0bf-4d99-b143-6ee555685564', 'USB Type C cable', 11.59, 25),
       ('260f7043-d0bf-4d99-b143-6ee555685565', 'Iphone 15 Pro Max 256 gb', 1147.0, 2),
       ('260f7043-d0bf-4d99-b143-6ee555685566', 'POCO phone', 1.99, 4),
       ('260f7043-d0bf-4d99-b143-6ee555685567', 'Lightning cable', 20.0, 42),
       ('260f7043-d0bf-4d99-b143-6ee555685568', 'Samsung A 23', 85.0, 90),
       ('260f7043-d0bf-4d99-b143-6ee555685569', 'Screen cleaner', 7.89, 86),
       ('260f7043-d0bf-4d99-b143-6ee555685570', 'Case Iphone 12', 19.0, 59),
       ('260f7043-d0bf-4d99-b143-6ee555685571', 'Mano vargas', 0.99, 1),
       ('260f7043-d0bf-4d99-b143-6ee555685572', 'Iphone 13', 555.0, 4);

insert into PRODUCT_CATEGORY(NAME)
VALUES ('Phone'),
       ('Phone part'),
       ('Cables'),
       ('Accesories');

insert into PRODUCT_PRODUCT_CATEGORIES(product_id, product_categories_id)
VALUES (1, 2),
       (2, 1);

INSERT INTO users(name, surname, email, password, zip_code, phone_number)
VALUES ('Admin', 'Admin', 'admin@eshop.lt', '$2a$10$FBByjrD2r.nVxQTd0Nc/cONDD3MtLXi8ozq9PIG7em/4mjgExnRpe', 'LT-0001', '+37060012345'),
       ('User', 'User', 'user@eshop.lt', '$2a$10$FBByjrD2r.nVxQTd0Nc/cONDD3MtLXi8ozq9PIG7em/4mjgExnRpe', 'LT-0002', '+37060012346');

INSERT INTO authority(name, description)
VALUES ('ADMIN', NULL),
       ('USER', 'User with limited rights');

INSERT INTO users_authorities(user_id, authorities_id)
VALUES (1, 1),
       (1, 2),
       (2, 2);