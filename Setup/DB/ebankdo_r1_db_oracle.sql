cd $ORACLE_HOME/bin/
./sqlplus system@orcl as sysdba


alter user hr identified by 123456789;
./sqlplus hr/123456789@orcl

INSERT INTO Product (Name) VALUES ('AMERICANEXPRESS');
INSERT INTO Product (Name) VALUES ('DINERSCLUB');
INSERT INTO Product (Name) VALUES ('MASTERCARD');
INSERT INTO Product (Name) VALUES ('VISA');

COMMIT;

INSERT INTO Customer (Name, ProductID) VALUES ('Luck', 'AMERICANEXPRESS');
INSERT INTO Customer (Name, ProductID) VALUES ('Jhon', 'DINERSCLUB');
INSERT INTO Customer (Name, ProductID) VALUES ('Sarah', 'MASTERCARD');
INSERT INTO Customer (Name, ProductID) VALUES ('Tim', 'VISA');
INSERT INTO Customer (Name, ProductID) VALUES ('Tomy', 'VISA');

COMMIT;