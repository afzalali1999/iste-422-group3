javac -cp lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar *.java
java -cp .;lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeConnectorTest
java -cp .;lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeTable
java -cp .;lib/junit-4.12.jar;lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeField
java RunEdgeConvert
