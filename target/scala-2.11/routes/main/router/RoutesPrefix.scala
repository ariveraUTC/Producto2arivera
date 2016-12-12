
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/workspace9/Producto2arivera/conf/routes
// @DATE:Mon Dec 12 07:41:24 COT 2016


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
