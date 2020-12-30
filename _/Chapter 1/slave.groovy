for (slave in hudson.model.Hudson.instance.slaves) {
   println "Slave class: ${slave.class}"
   println "Slave name: ${slave.name}" 
   println "Slave URL: ${slave.rootPath}"
   println "Slave URL: ${slave.labelString}\n"
}
