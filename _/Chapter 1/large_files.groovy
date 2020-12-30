root = jenkins.model.Jenkins.instance.getRootDir()
count = 0
size =0
maxsize=1024*1024*32
root.eachFileRecurse() { file ->  
        count++
        size+=file.size();
        if (file.size() > maxsize) {
            println "Thinking about deleting: ${file.getPath()}"
            // do things to large files here
        }
}  
println "Space used ${size/(1024*1024)} MB Number of files ${count}"
