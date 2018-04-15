// define a grammar called PoorWord
grammar PoorWord;
eenvoudigezin 	: 	naamwoordelijk_deel werkwoordelijk_deel naamwoordelijk_deel ;
naamwoordelijk_deel 	: 	lidwoord zelfstandig_naamwoord ;
zelfstandig_naamwoord 	: 	('brood') | ('man') | ('boer');
lidwoord	: 	('de') | ('het') | ('een') ;
werkwoordelijk_deel 	: 	('laat') | ('eet') | ('koopt') | ('snijdt') ;
WS  : [ \t\r\n]+ -> skip ;