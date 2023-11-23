grammar JSON;

json: jsonObject | jsonArray;

jsonObject: '{' (pair (',' pair)*)? '}';
pair: STRING ':' value;

value: STRING
     | NUMBER
     | jsonObject
     | jsonArray
     | 'true'
     | 'false'
     | 'null'
     ;

jsonArray: '[' (value (',' value)*)? ']';

STRING: '"' (ESC | ~["\\])* '"';
fragment ESC: '\\' (["\\/bfnrt] | UNICODE);
fragment UNICODE : 'u' HEX HEX HEX HEX;
fragment HEX : [0-9a-fA-F];

NUMBER: '-'? (INT '.' [0-9]+ EXP? | INT EXP?);
fragment INT: '0' | [1-9] [0-9]*;
fragment EXP: [Ee] [+\-]? INT;

WS: [ \t\n\r]+ -> skip;

