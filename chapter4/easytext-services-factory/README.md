javac --module-source-path src -d mods -m easytext.analysis.api,easytext.analysis.coleman,easytext.analysis.kincaid,easytext.cli


java --module-path mods -m easytext.cli/javamodularity.easytext.cli.Main ../exampletext.txt
