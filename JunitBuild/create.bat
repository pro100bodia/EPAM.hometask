cd src
javac -cp ../lib/junit-4.12.jar -d ../resource App.java

cd ../resource 
jar -cf JunitBuild.jar App.class ../lib/junit-4.12.jar

