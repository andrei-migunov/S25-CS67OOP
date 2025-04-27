You likely won't have much success using the 'compile and run' button we normally use.

Instead, compile the file in the terminal using

javac -cp ".;lib/*" src/*.java

and run it using 

java -cp ".;lib/*;src" DVDDatabaseExample

As always, remember to actually be in the right directory. The above commands have to be run from the DVDSTOREAPPSTARTER directory.