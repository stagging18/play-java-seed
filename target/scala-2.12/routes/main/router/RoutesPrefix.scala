// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rajjyoti/Desktop/New Folder/May/play-java-seed/conf/routes
// @DATE:Wed May 29 11:41:44 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
