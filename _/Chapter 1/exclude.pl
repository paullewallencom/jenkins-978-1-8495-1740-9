#!/usr/bin/perl

# List files excluded by $exclude_pattern under $content

use File::Find;
my $content = "/var/lib/jenkins";
my $exclude_pattern = '^.*\.(war)|(class)|(jar)$';

find( \&excluded_file_summary, $content );
sub excluded_file_summary {
	if ((-f $File::Find::name)&&( $File::Find::name =~/$exclude_pattern/)){
            print "$File::Find::name\n";
	}
}
