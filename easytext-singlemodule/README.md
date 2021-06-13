--From the easy text single module folder run the following.


create mods folder under easy text single module folder

javac -d out src/easytext/javamodularity/easytext/Main.java src/easytext/module-info.java


jar -cfe mods/easytext.jar javamodularity.easytext.Main -C out .

create Text.txt for the text processing.

java --module-path mods -m easytext Text.txt
