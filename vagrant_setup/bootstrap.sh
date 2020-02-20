#!/usr/bin/env bash
case $(id -u) in
    0)
        # install java 8
        apt update
        apt install -y debconf-utils
        #sudo debconf-set-selections < "/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/vagrant_projects/shared/selections.conf"
        export LANGUAGE=en_US.UTF-8
        export LANG=en_US.UTF-8
        export LC_ALL=en_US.UTF-8
        locale-gen en_US.UTF-8
        dpkg-reconfigure locales
        #sudo dpkg-reconfigure keyboard-configuration -f noninteractive
        #export DEBIAN_FRONTEND=noninteractive
        # DEBIAN_FRONTEND=noninteractive apt-get install keyboard-configuration
        apt upgrade -y
        apt install -y openjdk-8-jdk xauth
        apt install -y junit4 maven git emacs unzip gradle
	apt upgrade -y

  echo "apt upgrade processed"

  #MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork/OpenSourceProjects"
	  mkdir benchmarks
	  cd benchmarks

  echo "In benchmarks folder"
  # jsoup runs fine, jacoco .xml report generated successfully
	wget https://github.com/jhy/jsoup/archive/jsoup-1.10.1.tar.gz
	tar xzvf jsoup-1.10.1.tar.gz
  ( cd jsoup-jsoup-1.10.1; patch pom.xml -i /vagrant/shared/patchfile_jsoup_jsoup_1.10.1.patch)
  ( cd jsoup-jsoup-1.10.1; mvn clean test )
  ( cd jsoup-jsoup-1.10.1; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report --classfiles ./target/classes/ --xml ./jsoup_jsoup_1.10.1_coverage.xml )

	# # 3.3 runs fine
	# wget http://archive.apache.org/dist/commons/math/source/commons-math3-3.6.1-src.tar.gz
	# tar xzvf commons-math3-3.6.1-src.tar.gz
	# ( cd commons-math3-3.6.1-src; mvn test )
  #
	# # 1 test failure
  # wget http://archive.apache.org/dist/commons/lang/source/commons-lang3-3.3-src.tar.gz
	# tar xzvf commons-lang3-3.3-src.tar.gz
	# ( cd commons-lang3-3.3-src; mvn test )

    # jmeter. This is a gradle build project, which has jacocoReport command built-in
    # The current build has error for task :src:dist-check:batchTestRedirectionPolicies, so it is skipped in the build below
    wget https://archive.apache.org/dist/jmeter/source/apache-jmeter-5.2.1_src.tgz
    tar xzvf apache-jmeter-5.2.1_src.tgz
    ( cd apache-jmeter-5.2.1; ./gradlew -x :src:dist-check:batchTestRedirectionPolicies test)
    ( cd apache-jmeter-5.2.1; ./gradlew -x :src:dist-check:batchTestRedirectionPolicies jacocoReport)

    # joda-time-2.10.5 runs fine, jacoco .xml report generated successfully
    wget https://github.com/JodaOrg/joda-time/archive/v2.10.5.tar.gz
    tar xzvf v2.10.5.tar.gz
    ( cd joda-time-2.10.5; patch pom.xml -i /vagrant/shared/patchfile_joda_time_2.10.5.patch)
    ( cd joda-time-2.10.5; mvn clean test )
    ( cd joda-time-2.10.5; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report --classfiles ./target/classes/ --xml ./joda_time_2.10.5_coverage.xml )

    # findbugs-3.0.1
    wget https://sourceforge.net/projects/findbugs/files/findbugs/3.0.1/findbugs-3.0.1-source.zip
    unzip findbugs-3.0.1-source.zip
    ( cd findbugs-3.0.1; patch pom.xml -i /vagrant/shared/patchfile_findbugs_3.0.1.patch)
    ( cd findbugs-3.0.1; mvn clean test )
    ( cd findbugs-3.0.1; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report --classfiles ./target/classes/ --xml ./findbugs_3.0.1_coverage.xml )

    ;;
    *)
esac
