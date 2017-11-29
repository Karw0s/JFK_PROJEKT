grammar DateCalculator;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'
fragment DOT            : '.';
fragment FRACTION       : DOT [0-9]* '1'..'9';

Add           : '+';
Subtract      : '-';
Slash		  : '/';

WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

fragment DZIEN	: '0'[1-9]
				| [1-2][0-9]
				| '3'[0-1]
				;

fragment MIESIAC	: 'STY'
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

fragment ROK : [0-9][0-9][0-9][0-9];
				
Date	: DZIEN '-' MIESIAC '-' ROK;

Timespan	: '0'[0-9]':'[0-5][0-9]':'[0-5][0-9]
		| '1'[0-9]':'[0-5][0-9]':'[0-5][0-9]
		| '2'[0-4]':'[0-5][0-9]':'[0-5][0-9]
		;

dzien	: DZIEN;
miesiac : MIESIAC;
rok		: ROK;

datetime	: Date Timespan;
timespan 	: Timespan;
date 		: dzien Slash miesiac Slash rok;


operation :'(' operation ')'
		  | ( date | datetime ) op=Subtract ( date | datetime | operation )
		  | ( date | datetime | timespan ) 
			op=( Add | Subtract )
            ( timespan | operation )
		  | timespan op=Add (date | datetime | operation)
          ;

expression:
          | date
		  | datetime 
		  | timespan 
		  | operation
          ;