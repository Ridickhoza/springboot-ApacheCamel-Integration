CREATE TABLE `customers` (
	`custId` INT(11) NOT NULL,
    `first_name` VARCHAR(55) NOT NULL,
    `surname` 	VARCHAR(55) NOT NULL,
    `email`		VARCHAR(55) NOT NULL,
    `password`	VARCHAR(55) NOT NULL,
    PRIMARY KEY(`custId`)
);