MAIN_CLASS = Main
MAIN_ARGS = -v
VERSION = 0.1

JAVA_OPTS = -client -ea -Xms1g -Xmx1g

run:
	sbt 'run-main \$(MAIN_CLASS) \$(MAIN_ARGS)'

run-app: stage run-app-command

run-app-command:
	export JAVA_OPTS="\$(JAVA_OPTS)" && bash target/universal/stage/bin/$name$ -main \$(MAIN_CLASS) -- \$(MAIN_ARGS)

compile:
	sbt compile

test:
	sbt test

stage:
	sbt stage

doc:
	sbt doc && open target/scala-2.11/api/index.html
