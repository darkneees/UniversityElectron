
INSERT INTO type_components (key_name, name) VALUES ('servo', 'Сервоприводы');
INSERT INTO type_components (key_name, name) VALUES ('resistor', 'Резисторы');
INSERT INTO type_components (key_name, name) VALUES ('capacitor', 'Конденсаторы');
INSERT INTO type_components (key_name, name) VALUES ('diode', 'Диоды');
INSERT INTO type_components (key_name, name) VALUES ('transistor', 'Транзисторы');
INSERT INTO type_components (key_name, name) VALUES ('inductance', 'Индуктивности');
INSERT INTO type_components (key_name, name) VALUES ('other', 'Прочее');
INSERT INTO type_components (key_name, name) VALUES ('pcb', 'Ис, платы и модули');

INSERT INTO Capacitors (name, value, package, amount, section)
VALUES ('Резистор чип, 0,125Вт, 1%', '1,5 кОм', 'smd0805', 14, '1');


INSERT INTO Resistors (name, value, package, amount, note, section)
VALUES ('Резистор чип, 0,125Вт, 1%', '4,7 кОм', 'smd0805', 43, 'Примечание', '1');

INSERT INTO Capacitor (name, value, voltage, package, amount, note, section)
VALUES ('Керамический конденсатор чип, X7R, 10%', '100 нФ', '25', 'smd0805', '48', '', '2');