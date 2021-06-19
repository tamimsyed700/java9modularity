javac -d mods --module-source-path src -m easytext.analysis.api,easytext.analysis.coleman,easytext.analysis.kincaid,easytext.filtering
 java --module-path mods -m easytext.filtering/javamodularity.easytext.filtering.Main
