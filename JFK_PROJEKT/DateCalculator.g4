grammar DateCalculator;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'

Dot           : '.';
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

MINUTY 	: [0-5][0-9];

LICZBA_DNI : [0-9]+;


expression	:
			  date								
			| datetime							
			| timespan							
			| operation							
			;

operation 	: ( date | datetime ) op=Add ( timespan | operation )					# dateAddTimespan
			| timespan op=( Add| Subtract ) ( timespan | operation )				# timespanOpTimespan
			| timespan op=Add (date | datetime | operation)							# timespanAddDate
			| ( date | datetime  ) op=Subtract ( timespan | operation )				# dateSubTimespan
			| ( date | datetime ) op=Subtract ( date | datetime | operation )		# dateSubDate														
			;
			
datetime	: date godziny ( Separator | Dot ) minuty ( Separator | Dot ) sekundy;
date		: dzien (Dot | Slash) miesiac (Dot|Slash) rok;
timespan	: ( liczba_dni Dot )? godziny ( Separator | Dot) minuty ( Separator | Dot ) sekundy;

dzien		: DZIEN | Zero_dwaczt;
liczba_dni	: LICZBA_DNI | dzien | MINUTY | ROK;
miesiac 	: MIESIAC;
rok			: ROK;
godziny 	: Zero_dwaczt;
minuty		: Zero_dwaczt | DZIEN | MINUTY;
sekundy		: Zero_dwaczt | DZIEN | MINUTY;
