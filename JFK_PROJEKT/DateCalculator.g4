grammar DateCalculator;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'

DOT           : '.';
Add           : '+';
Subtract      : '-';
Slash		  : '/';
Separator	  : ':';

WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

Zero_dwaczt : '0'[0-9]
		| '1'[0-9]
		| '2'[0-4]
		;

DZIEN	: '0'[1-9]
		| [1-2][0-9]
		| '3'[0-1]
		;

MIESIAC	: 'STY'
		| 'LUT'
		| 'MAR'
		| 'KWI'
		| 'MAJ'
		| 'CZE'
		| 'LIP'
		| 'SIE'
		| 'WRZ'
		| 'PAZ'
		| 'LIS'
		| 'GRU'
		;

ROK : [0-9][0-9][0-9][0-9]; 

//TIME	: GODZINY Separator MINUTY Separator SEKUNDY;

// GODZINY : '0'[0-9]
// 		| '1'[0-9]
// 		| '2'[0-4]
// 		;


MINUTY 	: [0-5][0-9];

LICZBA_DNI : [0-9]+;
//SEKUNDY : [0-5][0-9];

//Date	: DZIEN '-' MIESIAC '-' ROK;

// Time	: '0'[0-9]':'[0-5][0-9]':'[0-5][0-9]
// 			| '1'[0-9]':'[0-5][0-9]':'[0-5][0-9]
// 			| '2'[0-4]':'[0-5][0-9]':'[0-5][0-9]
// 			;

expression	: //expression Add expression			
			//| expression Subtract expression   
			 date								
			| datetime							
			| timespan							
			| operation							
			;

operation 	: ( date | datetime ) op=Add ( timespan | operation )					# dateAddTimespan
			| timespan op=Add ( timespan | operation )								# timespanAddTimespan
			| timespan op=Add (date | datetime | operation)							# timespanAddDate
			| ( date | datetime  ) op=Subtract ( timespan | operation )				# dateSubTimespan
			| timespan op=Subtract ( timespan | operation )							# timespanSubTimespan
			| ( date | datetime ) op=Subtract ( date | datetime | operation )		# dateSubDate
			| '(' operation ')'														# oper
			;
			
datetime	: date godziny Separator minuty Separator sekundy;
date: dzien DOT miesiac DOT rok; //to jest test
timespan: (liczba_dni DOT)? godziny Separator minuty Separator sekundy ;

dzien	: DZIEN | Zero_dwaczt;
liczba_dni : LICZBA_DNI | dzien | MINUTY | ROK;
miesiac : MIESIAC;
rok		: ROK;
godziny : Zero_dwaczt;
minuty	: Zero_dwaczt | DZIEN | MINUTY;
sekundy	: Zero_dwaczt | DZIEN | MINUTY;
