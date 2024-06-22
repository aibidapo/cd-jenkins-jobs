job("db_refresh-job") {
	description()
	keepDependencies(false)
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("echo \"Hello, I am your slave system\" >> /home/ubuntu/maven.txt")
	}
}
