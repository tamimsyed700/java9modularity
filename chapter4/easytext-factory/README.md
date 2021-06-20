 javac -d out --module-source-path src -m easytext.cli,easytext.gui,easytext.analysis.api,easytext.analysis.coleman,easytext.analysis.factory,easytext.analysis.kincaid

java --module-path out -m easytext.cli/javamodularity.easytext.cli.Main ../exampletext.txt
