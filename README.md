# rpm-packaging-example
Packaging Java application as RPM along with init.d service scripts using maven-rpm plugin

##1. Build Environment Prerequisites (if Ubuntu)
      $ sudo apt-get install rpm
##2. How to build the Project
      $ mvn clean install
      On successful maven build, rpm package will be generated and kept under 'target/rpm/rpm-packaging-example/RPMS/noarch'
