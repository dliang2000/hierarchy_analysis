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
        apt install -y junit4 maven ant git python3 emacs unzip gradle
	apt upgrade -y

  echo "apt upgrade processed"

  #MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork/OpenSourceProjects"
	  mkdir benchmarks
	  cd benchmarks
    mkdir csv
  echo "In benchmarks folder"

  # # 3.3 runs fine
	# wget http://archive.apache.org/dist/commons/math/source/commons-math3-3.6.1-src.tar.gz
	# tar xzvf commons-math3-3.6.1-src.tar.gz
	# ( cd commons-math3-3.6.1-src; mvn test )
  #

  # benchmark 1: jsoup-1.10.1
  # jsoup runs fine, jacoco .xml report generated successfully
	# wget https://github.com/jhy/jsoup/archive/jsoup-1.10.1.tar.gz
	# tar xzvf jsoup-1.10.1.tar.gz
  # ( cd jsoup-jsoup-1.10.1; patch pom.xml -i /vagrant/shared/patch/patchfile_jsoup_jsoup_1.10.1.patch)
  # ( cd jsoup-jsoup-1.10.1; mvn clean test )
  # ( cd jsoup-jsoup-1.10.1; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report --classfiles ./target/classes/ --xml ./jsoup_jsoup_1.10.1_coverage.xml )
  # ( cd jsoup-jsoup-1.10.1; python3 /vagrant/shared/python_scripts/jsoup_jsoup_1.10.1_processing.py )

  # benchmark 2: commons-lang3-3.9
  # commons-lang3-3.9 runs fine, jacoco .xml report generated successfully
  # wget http://archive.apache.org/dist/commons/lang/source/commons-lang3-3.9-src.tar.gz
	# tar xzvf commons-lang3-3.9-src.tar.gz
  # ( cd commons-lang3-3.9-src; patch pom.xml -i /vagrant/shared/patch/patchfile_commons_lang3_3.9.patch )
	# ( cd commons-lang3-3.9-src; mvn clean test )
  # ( cd commons-lang3-3.9-src; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report ./target/jacoco.exec --classfiles ./target/classes/ --xml ./commons_lang3_3.9_src_coverage.xml )
  # ( cd commons-lang3-3.9-src; python3 /vagrant/shared/python_scripts/commons_lang3_3.9_src_processing.py )

    # jmeter. This is a gradle build project, which has jacocoReport command built-in
    # The current build has error for task :src:dist-check:batchTestRedirectionPolicies, so it is skipped in the build below
    # wget https://archive.apache.org/dist/jmeter/source/apache-jmeter-5.2.1_src.tgz
    # tar xzvf apache-jmeter-5.2.1_src.tgz
    # ( cd apache-jmeter-5.2.1; ./gradlew -x :src:dist-check:batchTestRedirectionPolicies test)
    # ( cd apache-jmeter-5.2.1; ./gradlew -x :src:dist-check:batchTestRedirectionPolicies jacocoReport)

    # benchmark 3: joda-time-2.10.5
    # joda-time-2.10.5 runs fine, jacoco .xml report generated successfully
    wget https://github.com/JodaOrg/joda-time/archive/v2.10.5.tar.gz
    tar xzvf v2.10.5.tar.gz
    ( cd joda-time-2.10.5; patch pom.xml -i /vagrant/shared/patch/patchfile_joda_time_2.10.5.patch )
    ( cd joda-time-2.10.5; mvn clean dependency:copy-dependencies; mvn test; touch is_maven )
    ( cd joda-time-2.10.5; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report --classfiles ./target/classes/ --xml ./joda_time_2.10.5_coverage.xml )
    ( cd joda-time-2.10.5; python3 /vagrant/shared/python_scripts/joda_time_2.10.5_processing.py )
    ( /vagrant/shared/shell_scripts/runjava_joda_time_2.10.5.sh )

    # benchmark 4: findbugs-3.0.1
    # findbugs-3.0.1 runs fine, jacoco .xml report generated successfully
    # wget https://sourceforge.net/projects/findbugs/files/findbugs/3.0.1/findbugs-3.0.1-source.zip
    # unzip findbugs-3.0.1-source.zip
    # ( cd findbugs-3.0.1; patch pom.xml -i /vagrant/shared/patch/patchfile_findbugs_3.0.1.patch )
    # ( cd findbugs-3.0.1; mvn clean test )
    # ( cd findbugs-3.0.1; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report --classfiles ./target/classes/ --xml ./findbugs_3.0.1_coverage.xml )
    # ( cd findbugs-3.0.1; python3 /vagrant/shared/python_scripts/findbugs_3.0.1_processing.py )

    # benchmark 5: gson-2.8.5
    # gson-2.8.5 runs fine, jacoco .xml report generated successfully
    # wget https://github.com/google/gson/archive/gson-parent-2.8.5.tar.gz
    # tar xzvf gson-parent-2.8.5.tar.gz
    # ( cd gson-gson-parent-2.8.5; patch pom.xml -i /vagrant/shared/patch/patchfile_gson_2.8.5.patch )
    # ( cd gson-gson-parent-2.8.5; mvn clean test )
    # ( cd gson-gson-parent-2.8.5; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report --classfiles ./target/classes/ --xml ./gson_2.8.5_coverage.xml )
    # ( cd gson-gson-parent-2.8.5; python3 /vagrant/shared/python_scripts/gson_2.8.5_processing.py )

    # benchmark 6: javacc-7.0.5
    # javacc-7.0.5 runs fine, jacoco .xml report generated successfully
    # wget https://github.com/javacc/javacc/archive/7.0.5.tar.gz
    # tar xzvf 7.0.5.tar.gz
    # ( cd javacc-7.0.5; patch pom.xml -i /vagrant/shared/patch/patchfile_javacc_7.0.5.patch )
    # ( cd javacc-7.0.5; mvn clean test )
    # ( cd javacc-7.0.5; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report ./target/coverage-reports/jacoco-ut.exec --classfiles ./target/classes/ --xml ./javacc_7.0.5_coverage.xml )
    # ( cd javacc-7.0.5; python3 /vagrant/shared/python_scripts/javacc_7.0.5_processing.py )

    # benchmark 7: jgrapht-1.3.1
    #
    # wget https://github.com/jgrapht/jgrapht/archive/jgrapht-1.3.1.tar.gz
    # tar xzvf jgrapht-1.3.1.tar.gz
    # ( cd jgrapht-jgrapht-1.3.1; patch pom.xml -i /vagrant/shared/patch/patchfile_jgrapht_1.3.1.patch )
    # ( cd jgrapht-jgrapht-1.3.1; mvn clean test )
    # ( cd jgrapht-jgrapht-1.3.1; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report ./target/coverage-reports/jacoco-ut.exec --classfiles ./target/classes/ --xml ./jgrapht_1.3.1_coverage.xml )
    # ( cd jgrapht-jgrapht-1.3.1; python3 /vagrant/shared/python_scripts/jgrapht_1.3.1_processing.py )

    # guava-28.2
    # wget https://github.com/google/guava/archive/v28.2.tar.gz
    # tar xzvf v28.2.tar.gz
    # ( cd guava-28.2; patch pom.xml -i /vagrant/shared/patchfile_guava_28.2.patch)
    # ( cd guava-28.2; mvn clean test )
    # ( cd guava-28.2; java -jar /vagrant/shared/jacoco-0.8.5/lib/jacococli.jar report --classfiles ./target/classes/ --xml ./guava_28.2_coverage.xml )



    ;;
    *)
esac
