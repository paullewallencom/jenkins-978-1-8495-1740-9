def site= new File('./target/site')
site.mkdirs()
def index = new File('./target/site/our_results.html')
if (index.exists()){index.delete()}
index << '<h3>Important results</h3>'
index << "${new Date()}\n"
index << '<ol>'

def random = new Random()
for ( i in 1..40 ) {
    index << "<li>Result[${i}]=${random.nextInt(50)}\n"
}
index << '</ol>'
