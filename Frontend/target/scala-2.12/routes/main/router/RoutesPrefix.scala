// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/loganschmitt/Documents/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Thu Feb 17 12:06:11 CST 2022


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
