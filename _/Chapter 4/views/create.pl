#!/usr/bin/perl
$counter=0;
$end=20;
$host='http://localhost:8080';
while($end > $counter){
    $counter++;
    print "<form action=$host/createItem?mode=copy method=POST>\n";
    print "<input type=text name=name value=CH4.fake.$counter>\n";
    print "<input type=text name=from value=Template1 >\n";
    print "<input type=submit value='Create CH4.fake.$counter'>\n";
    print "</form><br>\n";
    print "<form action=$host/job/CH4.fake.$counter/doDelete method=POST>\n";
    print "<input type=submit value='Delete CH4.fake.$counter'>\n";
    print "</form><br>\n";
}

