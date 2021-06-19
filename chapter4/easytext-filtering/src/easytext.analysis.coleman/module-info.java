module easytext.analysis.coleman {
    requires easytext.analysis.api;
   // exports javamodularity.easytext.analysis.coleman;
    provides javamodularity.easytext.analysis.api.Analyzer with javamodularity.easytext.analysis.coleman.Coleman;
}