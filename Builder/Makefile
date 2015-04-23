JC = javac
CLASSES := client/Client.java
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java
default: classes
classes: $(CLASSES:.java=.class)
clean:
	rm cellphone/*.class client/*.class
