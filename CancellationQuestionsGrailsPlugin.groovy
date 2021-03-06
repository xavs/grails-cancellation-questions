class CancellationQuestionsGrailsPlugin {
    // the plugin version
    def version = "0.4.4"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.1 > *"
    // the other plugins this plugin depends on

    def dependsOn = [:]
    def loadAfter = ['platform-core']

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
      "grails-app/views/error.gsp",
      "grails-app/conf/CancellationQuestionsBootStrap.groovy"
    ]

    def title = "Cancellation Questions Plugin" // Headline display name of the plugin
    def description = '''\
      Brief summary/description of the plugin.
    '''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/cancellation-questions"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
//    def license = "APACHE"

    def organization = [ name: "Stratus5", url: "http://www.stratus5.com/" ]
    def developers = [ [ name: "Eamonn O'Connell", email: "@34m0" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
