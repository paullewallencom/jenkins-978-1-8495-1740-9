#!/usr/bin/perl
my $workspace = $ENV{'WORKSPACE'};

open(P1, ">$workspace/hits.properties")|| die;
open(P2, ">$workspace/misses.properties")|| die;
print P1 "YVALUE=".rand(100);
print P2 "YVALUE=".rand(50);
