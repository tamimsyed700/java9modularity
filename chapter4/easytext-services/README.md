javac -d mods --module-source-path src -m easytext.cli,easytext.analysis.api,easytext.analysis.coleman,easytext.analysis.kincaid,easytext.gui

java --module-path mods -m easytext.gui/javamodularity.easytext.gui.Main ../exampletext.txt

# Create A JLink Image

jlink --module-path mods/:/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/jmods --add-modules easytext.cli --output image

# To view the modules for the easy text use this command after the jlink command
./image/bin/java --list-modules


# To run the module inside the mods folder

./imagewithothermodules/bin/java -m easytext.cli/javamodularity.easytext.cli.Main  ../exampletext.txt
