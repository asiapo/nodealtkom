job ('test code job')
{
    scm {
        git('https://github.com/asiapo/nodealtkom.git') { node ->
        node / gitConfigName('DSL script')
        node / gitConfigEmail('jenkins-dsl-script@altkom.com')
    }       
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell('npm test')
    }

}