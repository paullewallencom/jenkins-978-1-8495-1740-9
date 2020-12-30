import hudson.model.Run;
import java.text.DateFormat;

def warning='<font color=\'red\'>[ARCHIVE]</font> '
def now=new Date()

for (job in hudson.model.Hudson.instance.items) { 
    println "\nName: ${job.name}"
    Run lastSuccessfulBuild = job.getLastSuccessfulBuild()
    if (lastSuccessfulBuild != null) {
      def time = lastSuccessfulBuild.getTimestamp().getTime()
      if (now.year.equals(time.year)){
         println("Project has same year as build");
      }else {
        if (job.description.startsWith(warning)){
            println("Description has already been changed");
        }else{
            job.setDescription("${warning}${job.description}")
        }
     }
   }
}
