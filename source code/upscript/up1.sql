create database ipl;
use ipl;
create table player
(
Team varchar(20),
PlayerName varchar(20),
PlayerID integer primary key auto_increment,
PlayerAge integer,
PlayerCountry varchar(20),
PlayerRole varchar(10),
PlayerRuns integer,
PlayerWicket integer  
);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('csk','M.S.Dhoni',34,'INDIA','WKB',4000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('csk','SureshRaina',32,'INDIA','BAT',5049,20);

insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('csk','DeepakChahar',24,'INDIA','BOWL',200,40);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('csk','ShaneWatson',36,'AUSTRALIA','BAT',3000,25);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('csk','Fafduplessis',33,'SOUTHAFRICA','BAT',4020,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('srh','DavidWarner',30,'AUSTRALIA','BAT',3000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('srh','BhuvaneshwarKumar',28,'INDIA','BOWL',500,80);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('srh','KaneWilliamSon',31,'NEWZEALAND','BAT',3000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('srh','JohnnyBairstow',33,'ENGLAND','WKB',800,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('srh','VijayShankar',22,'INDIA','ALL',1000,30);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kxip','SamCurran',24,'ENGLAND','BOWL',0,1);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kxip','R.Ashwin',29,'INDIA','ALL',700,70);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kxip','SarfarazKhan',23,'INDIA','WKB',1100,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kxip','ChrisGayle',34,'WESTINDIES','BAT',3000,10);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kxip','AxarPatel',27,'INDIA','BOWL',750,45);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('mi','M.Markande',23,'INDIA','BOWL',30,25);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('mi','QuintonDeKock',29,'SOUTHAFRICA','WKB',1000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('mi','SuryaKumarYadav',27,'INDIA','BAT',1000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('mi','Bumrah',23,'INDIA','BOWL',100,70);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('mi','H.Pandya',28,'INDIA','ALL',1500,40);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rr','A.Rahane',30,'INDIA','BAT',3000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rr','S.Smith',30,'AUSTRALIA','BAT',2500,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rr','K.Goutham',26,'INDIA','ALL',300,20);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rr','R.Tripathi',24,'INDIA','BAT',1500,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rr','J.Butler',28,'ENGLAND','WKB',2000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rcb','ViratKohli',30,'INDIA','BAT',4570,3);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rcb','ABdeVilliers',33,'SOUTHAFRICA','WKB',3000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rcb','Chahal',27,'INDIA','BOWL',40,50);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rcb','UmeshYadav',28,'INDIA','BOWL',50,60);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('rcb','S.Hetmeyer',23,'WESTINDIES','BAT',570,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kkr','DineshKarthik',33,'INDIA','WKB',3000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kkr','S.Gill',23,'INDIA','BAT',500,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kkr','A.Russel',35,'WESTINDIES','ALL',3000,60);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kkr','N.Rana',24,'INDIA','BAT',500,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('kkr','S.Narine',32,'WESTINDIES','ALL',1000,98);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('dc','ShreyasIyer',26,'INDIA','BAT',1000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('dc','Shikhardhawan',32,'INDIA','BAT',2500,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('dc','AmitMishra',34,'INDIA','BOWL',400,130);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('dc','RishabPant',26,'INDIA','WKB',2000,0);
insert into player(team,PlayerName,PlayerAge,PlayerCountry,PlayerRole,PlayerRuns,PlayerWicket)values('dc','Rabada',22,'SOUTHAFRICA','BOWL',0,50);





use ipl;
create table team
(
 TeamName varchar(30),
 TeamCaptian varchar(10),
 TeamPlayed integer,
 TeamLose integer,
 TeamWins integer,
 TeamCoach varchar(20)
 );
insert into team(TeamName,TeamCaptian,TeamPlayed,TeamWins,TeamLose,TeamCoach)values('ChennaiSuperKings','M.S.Dhoni',128,84,44,'StethenFlemming');
insert into team(TeamName,TeamCaptian,TeamPlayed,TeamWins,TeamLose,TeamCoach)values('MumbaiIndians','R.Sharma',158,105,53,'M.Jayawardene');
insert into team(TeamName,TeamCaptian,TeamPlayed,TeamWins,TeamLose,TeamCoach)values('RoyalChallengesBanglore','ViratKohli',145,80,65,'GaryKirsten');
insert into team(TeamName,TeamCaptian,TeamPlayed,TeamWins,TeamLose,TeamCoach)values('KolkataKnightRiders','D.Karthik',148,95,53,'JacKallis');
insert into team(TeamName,TeamCaptian,TeamPlayed,TeamWins,TeamLose,TeamCoach)values('DelhiCapitals','S.Iyer',140,80,60,'RickyPonting');
insert into team(TeamName,TeamCaptian,TeamPlayed,TeamWins,TeamLose,TeamCoach)values('RajasthanRoyals','A.Rahane',147,90,57,'PaddyUpton');
insert into team(TeamName,TeamCaptian,TeamPlayed,TeamWins,TeamLose,TeamCoach)values('Sunrisershyderabad','B.Kumar',65,40,25,'Tommoody');
 insert into team(TeamName,TeamCaptian,TeamPlayed,TeamWins,TeamLose,TeamCoach)values('KingsXIPunjab','R.Ashwin',128,65,63,'MikeHesson');