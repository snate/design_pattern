JC = javac
CLASSES := adapter/Client.java adaptee/Adaptee.java
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java
default: classes
classes: $(CLASSES:.java=.class)
clean:
	rm adapter/*.class adaptee/*.class
