INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (1,'artefice',0,0,0,2,2,0,0,0,0,0,0,0,0);
INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (2,'artefice',1,0,0,3,3,0,0,0,0,0,0,0,0);
INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (3,'artefice',2,1,1,3,3,1,0,0,0,0,0,0,0);
INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (4,'artefice',3,1,1,4,3,2,0,0,0,0,0,0,0);
INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (5,'artefice',3,1,1,4,3,3,1,0,0,0,0,0,0);
INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (6,'artefice',4,2,2,5,3,3,2,0,0,0,0,0,0);
INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (7,'artefice',5,2,2,5,3,3,2,0,0,0,0,0,0);
INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (8,'artefice',6,2,2,6,3,3,3,1,0,0,0,0,0);
INSERT INTO LIVELLO_CLASSE (id,classe,bab,tempra,riflessi,volonta,magia1,magia2,magia3,magia4,magia5,magia6,magia7,magia8,magia9) VALUES (9,'artefice',6,3,3,6,3,3,3,2,0,0,0,0,0);


INSERT INTO RAZZA (nome,linguaggi, velocita, note) VALUES ('pixie','comune,silvano', 6,'note varie');



INSERT INTO PG (id,dado_vita,id_livello_classe,nome,cognome, razza) VALUES (1,'1d6',3,'Freed','Iork','pixie');




INSERT INTO TRATTO_RAZZIALE (titolo,descrizione, razza_nome) VALUES ('Poteri da pixie inferiori (Mag)','individuazione del bene, individuazione del caos, individuazione della legge, individuazione del male, intralciare, invisibilità', 'pixie');
INSERT INTO TRATTO_RAZZIALE (titolo,descrizione, razza_nome) VALUES ('Visione creouscolare', 'vede bene con scarsa luminosità', 'pixie');
INSERT INTO TRATTO_RAZZIALE (titolo,descrizione, razza_nome) VALUES ('Caratteristiche iniziali', '+4 des, +2 int, +2car', 'pixie');
INSERT INTO TRATTO_RAZZIALE (titolo,descrizione, razza_nome) VALUES ('Bonus abilità', '+2 ascoltare, cercare, osservare', 'pixie');




INSERT INTO TALENTO (titolo, benefici,  id_pg, descrizione) VALUES ('metamagia: incantesimi estesi', 'raddoppia la durata dell incantesimo' , 1, 'Un incantesimo esteso occupa uno slot incantesimo di un livello superiore a quello effettivo dell incantesimo');



INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Alterazione dell energia' , 'artefice', 'Un oggetto che fa uso di un tipo di energia cambia il tipo di energia utilizzato', 1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Alterazione del potenziamento' , 'artefice', 'Il bonus di potenziamento di uno scudo magico viene applicato agli attacchi con lo scudo, oppure il bonus di potenziamento di un arma magica viene applicato a Difendere con Due Armi', 1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Arma magica' , 'artefice', 'L arma ottiene un bonus di potenziamento di +1', 1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Aumentare arma personale' , 'artefice', 'L arma dell incantatore ottiene una capacità speciale con un modificatore del prezzo di mercato +1', 1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Identificare','artefice','Determina le proprietà di un oggetto magico',1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Infliggi danni leggeri','artefice','Infligge 1d8 danni +1 danno per livello (max +5) su un construtto',1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Luce' , 'artefice', 'L oggetto risplende come una torcia', 1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Oggetto accumula incantesimi' , 'artefice', 'Conserva un incantesimo in un oggetto', 1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Pietra magica' , 'artefice', 'Tre pietre ottengono +1 al tiro per colpire e infliggono 1d6+1 danni',1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Potenziamento di un abilità', 'artefice', 'Un oggetto conferisce un bonus di circostanza alle prove di abilità', 1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Potenziamento dell armatura inferiore', 'artefice', 'un armatura o uno scudo ottengono una capacità speciale con un modificatore del prezzo di mercato +1',1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Resistenza di un oggetto','artefice','Un oggetto conferisce un bonus di resistenza +1 o superiore ai tiri salvezza',1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Ripara danni leggeri','artefice','Cura 1d8 danni + 1 danno per livello (max +5) di un costrutto',1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Scudo della fede','artefice','Un aura conferisce un bonus di deviazione +2 o superiore',1);
INSERT INTO INCANTESIMO (titolo, classe, descrizione, lvl) VALUES ( 'Veste magica','artefice','Un armatura o uno scudo ottiene potenziamento di +1 migliore',1);