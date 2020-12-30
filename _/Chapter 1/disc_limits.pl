#!/usr/bin/perl

# Generate Logging for hard and soft limits

use File::Find;
my $content = "/var/lib/jenkins";
if ($#ARGV != 1 ) {
	print "[MISCONFIG ERROR] usage: hard soft (in Bytes)\n";
	exit(-1);
}
my $total_bytes=0;
my $hard_limit=$ARGV[0];
my $soft_limit=$ARGV[1];

find( \&size_summary, $content );

if ($total_bytes >= $hard_limit){
   print "[HARD_LIMIT ERROR] $total_bytes >= $hard_limit (Bytes)\n";
}elsif ($total_bytes >= $soft_limit){
   print "[SOFT_LIMIT WARN] $total_bytes >= $soft_limit (Bytes)\n";
}else{
   print "[SUCCESS] total bytes = $total_bytes\n";
}	

sub size_summary {
	if (-f $File::Find::name){
            # A global variable for total bytes measured
            $total_bytes+= -s $File::Find::name;
	}
}
