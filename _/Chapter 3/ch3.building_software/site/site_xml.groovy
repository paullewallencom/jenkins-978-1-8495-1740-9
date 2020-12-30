def site= new File('./src/site')
site.mkdirs()
def sxml=new File('./src/site/site.xml')
if (sxml.exists()){sxml.delete()}

sxml << '<?xml version="1.0" encoding="ISO-8859-1"?>'
sxml << '<project name="Super Project">'
sxml << '<body>'
def random = new Random()
if (random.nextInt(10) > 5){
    sxml << '    <menu name="My super project">'
    sxml << '     <item name="Key Performance Indicators" href="/our_results.html"/>'
    sxml << '   </menu>'
    print "Data Found menu item created\n"
}
sxml << '   <menu ref="reports" />'
sxml << '  </body>'
sxml << '</project>'

print "FINISHED - site.xml creation\n"

