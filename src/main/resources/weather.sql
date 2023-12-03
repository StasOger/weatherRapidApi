DROP TABLE weather;
commit;
create table weather (
    id integer auto_increment primary key,
    tempc float(53),
    maxwindmph float(53),
    pressuremb float(53),
    humidity float(53),
    conditiontype VARCHAR(255),
    locationname varchar(255),
    date DATETIME);

SELECT w FROM weather w ORDER BY w.date DESC LIMIT 1;

SELECT * FROM weather

SELECT AVG(w.tempc) FROM Weather w

SELECT AVG(w.tempc) FROM Weather w WHERE w.date BETWEEN '2023-12-01 21:30' AND '2023-12-03 21:30'

INSERT weather (tempc, maxwindmph, pressuremb, humidity, conditiontype, locationname, date)
VALUES (-21.8, 19.7, 1004.0, 94.0, 'Heavy snow', 'Europe/Minsk', '2023-11-29 21:30');
INSERT weather (tempc, maxwindmph, pressuremb, humidity, conditiontype, locationname, date)
VALUES (-51.8, 19.7, 1004.0, 94.0, 'Heavy snow', 'Europe/Minsk', '2023-11-30 21:30');
INSERT weather (tempc, maxwindmph, pressuremb, humidity, conditiontype, locationname, date)
VALUES (-5.8, 19.7, 1004.0, 94.0, 'Heavy snow', 'Europe/Minsk', '2023-12-01 21:30');
INSERT weather (tempc, maxwindmph, pressuremb, humidity, conditiontype, locationname, date)
VALUES (-2.8, 19.7, 1004.0, 94.0, 'Heavy snow', 'Europe/Minsk', '2023-12-02 21:30');
INSERT weather (tempc, maxwindmph, pressuremb, humidity, conditiontype, locationname, date)
VALUES (-1.8, 19.7, 1004.0, 94.0, 'Heavy snow', 'Europe/Minsk', '2023-12-03 21:30');
