job("shout") {
    description("This is anything")
    scm{
        git{
            remote{
                name("origin")
                url("https://github.com/aibidapo/chuckles_the_chatbot.git")
                credentials("aibidapo")
            }
            branch("*/main")
        }

    }
    label("slave-node")
    steps{
        shell(readFileFromWorkspace("resoures/db_refresh/pe/shout.sh"))
    }


}
