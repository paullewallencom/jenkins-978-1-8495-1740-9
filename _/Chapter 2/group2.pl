#!/usr/bin/perl
use URI;
use URI::Escape;
my $raw_user=$ENV{'U'};
my $group=uri_escape($raw_user);
print "grp_$group";
exit(0);
