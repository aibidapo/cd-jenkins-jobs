job("scream") {
    description("We are screaming!")
    scm{
        git{
            remote{
                name("origin")
                url("https://github.com/aibidapo/chuckles_the_chatbot.git")
                credentials("aibidapo")
            }
            branch("*/master")
        }

    }
    label("maven")
    steps{
        shell(readFileFromWorkspace("resources/db_refresh/pp/scream.sh"))
    }


}
