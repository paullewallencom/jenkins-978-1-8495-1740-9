#!/usr/bin/perl
use Net::LDAP;
use Net::LDAP::Util qw(ldap_error_text);

my $dn_part="ou=people,ou=mycompany,dc=nodomain";
my $home="/var/lib/jenkins/userContent";
my $user=$ENV{'U'};
my $pass=$ENV{'P'};

my $ldap = Net::LDAP->new("localhost");
my $result =$ldap->bind("uid=$user,$dn_part", password=>$pass);
  if ($result->code){
         my $message=ldap_error_text($result->code);
         print "dn=$dn\nError Message: $message\n";
         exit(1);
    }
# Do some provisioning
unless (-e  "$home/$user.html"){
    open(HTML, ">$home/$user.html");
    print HTML "Hello <b>$user</b> here is some information";
    close(HTML);
}
exit(0);
