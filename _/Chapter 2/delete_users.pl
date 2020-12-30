#!/usr/bin/perl
use Net::LDAP;
use Net::LDAP::Util qw(ldap_error_text);

my $number_users=2;
my $counter=0;
my $start=100;

my $ldap = Net::LDAP->new("localhost");
$ldap->bind("cn=admin,dc=nodomain",password=>"your_password");

while ($counter < $number_users){
	$counter++;
    $total=$counter+$start;
    my $dn="uid=tester$total,ou=people,ou=mycompany,dc=nodomain";
    my $result = $ldap->delete($dn); 
    if ($result->code){
         my $message=ldap_error_text($result->code);
         print "dn=$dn\nError Message: $message\n";
    }      
}
