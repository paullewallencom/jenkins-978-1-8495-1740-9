import java.util.Random 
Random random = new Random()  

hudson.model.Hudson.instance.items.each { job ->
  println ("Class: ${job.class}") 
  println ("Name: ${job.name}")
  println ("Root Dir: ${job.rootDir}")
  println ("URL: ${job.url}")
  println ("Absolute URL: ${job.absoluteUrl}") 
      
      if ("MyTest".equals(job.name)){
     		println ("Description: ${job.description}")
                job.setDescription("This is a test id: ${random.nextInt(99999999)}")
     }
  }
