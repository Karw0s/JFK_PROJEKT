grammar DateCalculator;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'
 DOT            : '.';
fragment FRACTION       : DOT [0-9]* '1'..'9';

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

operation 	: ( date | datetime ) op=Add ( timespan | operation )					# dateAddTiemspan
			| timespan op=Add ( timespan | operation )								# timespanAddTimespan
			| timespan op=Add (date | datetime | operation)							# timespanAddDate
			| ( date | datetime  ) op=Subtract ( timespan | operation )				# dateSubTimespan
			| timespan op=Subtract ( timespan | operation )							# timespanSubTimespan
			| ( date | datetime ) op=Subtract ( date | datetime | operation )		# dateSubDate
			| '(' operation ')'														# oper
			;
			
datetime	: date timespan;
//date 		: data_test;
//timespan 	: timespan_test;

date: dzien DOT miesiac DOT rok; //to jest test

timespan: godziny Separator minuty Separator sekundy ;

dzien	: DZIEN | Zero_dwaczt;
miesiac : MIESIAC;
rok		: ROK;
godziny : Zero_dwaczt;
minuty	: Zero_dwaczt | MINUTY;
sekundy	: Zero_dwaczt | MINUTY;
