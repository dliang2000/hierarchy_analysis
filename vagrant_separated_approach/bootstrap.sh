#!/usr/bin/env bash
sudo apt-get update
sudo apt-get upgrade
sudo apt-get install -y openjdk-8-jdk junit4 maven gradle ant
sudo apt-get install -y xauth git unzip python3 emacs jq
sudo apt-get upgrade -y
# # for maven-scm benchmark:
# sudo apt-get install subversion
#
# ( VERSION=0.17.0; \
# curl -sSL "https://github.com/facebook/infer/releases/download/v$VERSION/infer-linux64-v$VERSION.tar.xz" \
#   | sudo tar -C /opt -xJ && \
#     sudo ln -s "/opt/infer-linux64-v$VERSION/bin/infer" /usr/local/bin/infer
# )

mkdir benchmarks
cd benchmarks
../shared/bin/download.sh ../shared/projects.json

#../shared/bin/clean.sh ../shared/projects.json
#../shared/bin/run-tests.sh ../shared/projects.json




# benchmark 1: jsoup 1.9.2 vs 1.10.1
#wget https://github.com/jhy/jsoup/archive/jsoup-1.9.2.tar.gz
#tar xzvf jsoup-1.9.2.tar.gz
#( cd jsoup-jsoup-1.9.2; mvn clean; infer run -- mvn compile )
#( cd jsoup-jsoup-1.9.2; mvn test )

#wget https://github.com/jhy/jsoup/archive/jsoup-1.10.1.tar.gz
#tar xzvf jsoup-1.10.1.tar.gz
#( cd jsoup-jsoup-1.10.1; mvn clean; infer run -- mvn compile )
#( cd jsoup-jsoup-1.10.1; mvn test )

# benchmark 2: commons-math 3.2 vs 3.3
# note! commons-math-3.2 has test failures!
#wget http://archive.apache.org/dist/commons/math/source/commons-math3-3.2-src.tar.gz
#tar xzvf commons-math3-3.2-src.tar.gz
#( cd commons-math3-3.2-src; mvn test )
# 3.3 runs fine
#wget http://archive.apache.org/dist/commons/math/source/commons-math3-3.3-src.tar.gz
#tar xzvf commons-math3-3.3-src.tar.gz
#( cd commons-math3-3.3-src; mvn test )

# benchmark 3: commons-lang 3.2.1 vs 3.3
# 1 test failure
#wget http://archive.apache.org/dist/commons/lang/source/commons-lang3-3.2.1-src.tar.gz
#tar xzvf commons-lang3-3.2.1-src.tar.gz
#( cd commons-lang3-3.2.1-src; mvn test )

# 1 test failure
#wget http://archive.apache.org/dist/commons/lang/source/commons-lang3-3.3-src.tar.gz
#tar xzvf commons-lang3-3.3-src.tar.gz
#( cd commons-lang3-3.3-src; mvn test )

# benchmark 4: maven-svm 1.9.1 vs 1.11.2
#wget "http://archive.apache.org/dist/maven/scm/maven-scm-1.9.1-source-release.zip"
#unzip maven-scm-1.9.1-source-release.zip
#( cd maven-scm-1.9.1; mvn clean; infer run -- mvn compile )

#wget "http://archive.apache.org/dist/maven/scm/maven-scm-1.11.2-source-release.zip"
#unzip maven-scm-1.11.2-source-release.zip
#( cd maven-scm-1.11.2; mvn clean; infer run -- mvn -Drat.skip=true compile )

# benchmark 5: apache jmeter 5.1 vs 5.2.1
#wget "https://archive.apache.org/dist/jmeter/source/apache-jmeter-5.1_src.tgz"
#tar xzvf apache-jmeter-5.1_src.tgz
#( cd apache-jmeter-5.1; ./gradlew test )

#wget "https://archive.apache.org/dist/jmeter/source/apache-jmeter-5.2.1_src.tgz"
#tar xzvf apache-jmeter-5.2.1_src.tgz
#( cd apache-jmeter-5.2.1; ./gradlew test )

# benchmark 6: jodatime 2.0 vs 2.10.5
#wget https://github.com/JodaOrg/joda-time/archive/v2.0.tar.gz -O jodatime-2.0.tar.gz
#tar xzvf jodatime-2.0.tar.gz
#wget https://github.com/JodaOrg/joda-time/releases/download/v2.10.5/joda-time-2.10.5-dist.tar.gz
#tar xzvf joda-time-2.10.5-dist.tar.gz

# benchmark 7: jbehave 4.0.1 vs 4.6.1
#wget https://repo1.maven.org/maven2/org/jbehave/jbehave-distribution/4.0.1/jbehave-distribution-4.0.1-src.zip
#unzip jbehave-distribution-4.0.1-src.zip
#wget https://repo1.maven.org/maven2/org/jbehave/jbehave-distribution/4.6.1/jbehave-distribution-4.6.1-src.zip
#unzip jbehave-distribution-4.6.1-src.zip

# benchmark 8: jackson-annotations 2.7.0 vs 2.10.2
#wget https://github.com/FasterXML/jackson-annotations/archive/jackson-annotations-2.7.0.tar.gz
#tar xzvf jackson-annotations-2.7.0.tar.gz
#wget https://github.com/FasterXML/jackson-annotations/archive/jackson-annotations-2.10.2.tar.gz
#tar xzvf jackson-annotations-2.10.2.tar.gz

# benchmark 9: ph-commons 9.0.0 vs 9.3.9
#wget https://github.com/phax/ph-commons/archive/ph-commons-parent-pom-9.3.9.tar.gz
#tar xzvf ph-commons-parent-pom-9.3.9.tar.gz
#wget https://github.com/phax/ph-commons/archive/ph-commons-parent-pom-9.0.0.tar.gz
#tar xzvf ph-commons-parent-pom-9.0.0.tar.gz

# benchmark 10: appformer (uberfire) 7.5.0.Final vs 7.33.0.Final
#wget https://github.com/kiegroup/appformer/archive/7.33.0.Final.tar.gz -O appformer-7.33.0.Final.tar.gz
#tar xzvf appformer-7.33.0.Final.tar.gz
#wget https://github.com/kiegroup/appformer/archive/7.5.0.Final.tar.gz -O appformer-7.5.0.Final.tar.gz
#tar xzvf appformer-7.5.0.Final.tar.gz
