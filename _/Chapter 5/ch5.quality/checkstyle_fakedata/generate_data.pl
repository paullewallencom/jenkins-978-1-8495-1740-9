#!/usr/bin/perl
$rand=int(rand(9)+1);

print <<MYXML;
<?xml version="1.0" encoding="UTF-8"?>
<checkstyle version="5.4">
<file name="src/main/java/MAIN.java">
<error line="$rand" column="1" severity="error" message="line=$rand" description="My blah" source="MyCheck"/>
</file>
</checkstyle>
MYXML
# Need an extra line or multiline printing does not work ??
