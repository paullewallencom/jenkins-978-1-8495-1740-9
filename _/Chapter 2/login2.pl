#!/usr/bin/perl
my $user=$ENV{'U'};
my $pass=$ENV{'P'};
my $min=5;

if ((length($user) < $min) || (length($pass) < $min)) {
    //Do something here for failed logins
    exit (-1);
}
exit(0);
