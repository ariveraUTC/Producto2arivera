
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[Platoalacarta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(platos: java.util.List[Platoalacarta]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*2.1*/("""<html>
	<head>
	
	
	
	</head>
	<body>
	<table border=1>
	<tr>
		<td>Identificaci�n Plato</td>
		<td>Nombre Plato</td>
		<td>Precio Plato</td>
		<td>Fecha Plato</td>
		
	</tr>
	"""),_display_(/*17.3*/for(platoalacarta <- platos) yield /*17.31*/{_display_(Seq[Any](format.raw/*17.32*/("""
	"""),format.raw/*18.2*/("""<tr>
		<td>"""),_display_(/*19.8*/platoalacarta/*19.21*/.id),format.raw/*19.24*/("""</td>
		<td>"""),_display_(/*20.8*/platoalacarta/*20.21*/.name),format.raw/*20.26*/("""</td>
		<td>"""),_display_(/*21.8*/platoalacarta/*21.21*/.precio),format.raw/*21.28*/("""</td>
		<td>
		"""),_display_(/*23.4*/if(platoalacarta.fecha == null)/*23.35*/{_display_(Seq[Any](format.raw/*23.36*/("""
		"""),format.raw/*24.3*/("""<em>-</em>		
		""")))}/*25.5*/else/*25.10*/{_display_(Seq[Any](format.raw/*25.11*/("""
		"""),_display_(/*26.4*/platoalacarta/*26.17*/.fecha.format("dd MMM yyy")),format.raw/*26.44*/("""
		""")))}),format.raw/*27.4*/("""
		
		"""),format.raw/*29.3*/("""</td>
		
	</tr>
	""")))}),format.raw/*32.3*/("""
	
	
	
	"""),format.raw/*36.2*/("""</table>
	
	</body>

</html>
"""))
      }
    }
  }

  def render(platos:java.util.List[Platoalacarta]): play.twirl.api.HtmlFormat.Appendable = apply(platos)

  def f:((java.util.List[Platoalacarta]) => play.twirl.api.HtmlFormat.Appendable) = (platos) => apply(platos)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Dec 12 09:13:15 COT 2016
                  SOURCE: C:/workspace9/Producto2arivera/app/views/index.scala.html
                  HASH: 78bde9722fab14e1a9550a0bf5c383099b9cd64c
                  MATRIX: 768->1|902->40|929->41|1132->218|1176->246|1215->247|1244->249|1282->261|1304->274|1328->277|1367->290|1389->303|1415->308|1454->321|1476->334|1504->341|1546->357|1586->388|1625->389|1655->392|1689->409|1702->414|1741->415|1771->419|1793->432|1841->459|1875->463|1908->469|1956->487|1991->495
                  LINES: 27->1|32->1|33->2|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|60->29|63->32|67->36
                  -- GENERATED --
              */
          