javac -d mods --module-source-path src -m easytext.cli,easytext.analysis.api,easytext.analysis.coleman,easytext.analysis.kincaid,easytext.gui
java --module-path mods -m easytext.gui/javamodularity.easytext.gui.Main ../exampletext.txt
