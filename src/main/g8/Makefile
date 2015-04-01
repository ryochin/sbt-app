run:
	sbt 'run-main Main'

run-java: assembly
	java -cp target/scala-2.11/$name$-0.1.jar -client -ea -Xms1g -Xmx1g Main

compile:
	sbt compile

test:
	sbt test

assembly:
	sbt assembly
