job ('nodejs job')
{
    scm {
        git('https://github.com/asiapo/nodealtkom.git') { node 

        }
    }
    triggers {
        scm('H/5 * * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell('node app.js')
    }

}