MAIN_CLASS = Main
MAIN_ARGS = -v
VERSION = 0.1

run:
	sbt 'run-main \$(MAIN_CLASS) \$(MAIN_ARGS)'

run-java: assembly run-java-command

run-java-command:
	java -cp target/scala-2.11/$name$-\$(VERSION).jar -client -ea -Xms1g -Xmx1g \$(MAIN_CLASS) \$(MAIN_ARGS)

compile:
	sbt compile

test:
	sbt test

assembly:
	sbt assembly

doc:
	sbt doc && open target/scala-2.11/api/index.html
