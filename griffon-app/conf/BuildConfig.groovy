griffon.project.dependency.resolution = {
    inherits("global")
    log "warn" 
    repositories {
        griffonPlugins()
        griffonHome()
        griffonCentral()
        // flatDir name: 'steelPluginLib', dirs: 'lib'
    }
    dependencies {
        compile 'eu.hansolo:SteelSeries:3.7'
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}

griffon.jars.destDir='target/addon'
