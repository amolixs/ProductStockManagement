/*

author => amolixs
création des tables pour le project gestion de stock

*/

CREATE TABLE IF NOT EXISTS Product
(
	-- id
	id INT PRIMARY KEY NOT NULL,
	
	-- Nom du produit
	name VARCHAR(20) NOT NULL,
	
	-- Prix du produit
	price INT NOT NULL,
	
	-- Pour savoir si le produit est buvable ou non
	isADrink VARCHAR(5) NOT NULL,
	
	-- Origin du produit
	origin VARCHAR(20) NOT NULL,
	
	-- Chemin pour l'image du produit
	pathImage VARCHAR(50) NOT NULL
);
