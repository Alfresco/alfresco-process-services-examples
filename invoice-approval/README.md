# Invoice Approval process for Alfresco Process Services.

Originally created from [Martin Berljung](https://github.com/gravitonian/activiti-jar-blog).

The following section will take you through implementing a business process with Alfresco Process Services. We will build a simple Invoice Payment Approval Process.

To read a detailed description of the implemented process,please referto the [Invoice Payment Approval tutorial](https://community.alfresco.com/community/bpm/blog/2017/08/07/getting-started-with-alfresco-process-services).

## How to build the project

To run use `mvn clean install alfresco:run` or `./run.sh` and verify that it 

 * Runs the embedded Tomcat + H2 DB 
 * Runs Activiti App
 * Packages both a JAR with customization and a ZIP with the whole Activiti App
  
# Few things to notice

 * No parent pom
 * WAR assembly is handled by the Alfresco Maven Plugin configuration
 * Standard JAR packaging and layout
 * Works seamlessly with Eclipse and IntelliJ IDEA
 * No unit testing/functional tests just yet

 
