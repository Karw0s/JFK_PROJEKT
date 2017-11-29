grammar DateCalculator;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'
fragment DOT            : '.';
fragment FRACTION       : DOT [0-9]* '1'..'9';

Add           : '+';
Subtract      : '-';

WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

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

Date	: '0'[1-9] '-' MIESIAC '-' [0-9][0-9][0-9][0-9]
		| [1-2][0-9] '-' MIESIAC '-' [0-9][0-9][0-9][0-9]
		| '3'[0-1] '-' MIESIAC '-' [0-9][0-9][0-9][0-9]
		;

Timespan	: '0'[0-9]':'[0-5][0-9]':'[0-5][0-9]
		| '1'[0-9]':'[0-5][0-9]':'[0-5][0-9]
		| '2'[0-4]':'[0-5][0-9]':'[0-5][0-9]
		;

datetime	: Date Timespan;
timespan 	: Timespan;
date 		: Date;

dates	: date
		| datetime
		;

operation :
			( date | datetime | timespan ) 
			op=( Add | Subtract )
            ( timespan | operation )
		  | ( date | datetime ) Subtract ( date | datetime | operation )
		  | timespan Add (date | datetime | operation)
		  | '(' operation ')'
          ;

expression: operation
          | date
		  | datetime 
		  | timespan 
          ;