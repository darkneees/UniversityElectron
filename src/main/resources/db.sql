
INSERT INTO Components (key_name, name) VALUES ('resistor', 'Резисторы');
INSERT INTO Components (key_name, name) VALUES ('capacitor', 'Конденсаторы');
INSERT INTO Components (key_name, name) VALUES ('transistor', 'Транзисторы');

INSERT INTO Resistors (name, resistor_value, package, amount, box)
VALUES ('Резистор чип, 0,125Вт, 1%', '1,5 кОм', 'smd0805', 14, '1');


INSERT INTO Resistors (name, resistor_value, package, amount, note, box)
VALUES ('Резистор чип, 0,125Вт, 1%', '4,7 кОм', 'smd0805', 43, 'Примечание', '1');

INSERT INTO Capacitors (name, capacitor_value, voltage, package, amount, note, box)
VALUES ('Керамический конденсатор чип, X7R, 10%', '100 нФ', '25', 'smd0805', '48', '', '2');