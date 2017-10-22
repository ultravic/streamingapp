# Nome: Victor Picussa GRR: 20163068

JC = javac -J-Xmx2G
JR = java -Xmx2G

default: classes

run:
	$(JR) Program

classes:
	$(JC) components.java singleton.java visitors.java program.java

clean:
	-rm *.class
