
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Input Field Test</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar ml-4">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957; margin-left: 30px" >
                <strong>Input Field Test</strong>
            </h1>
            <h3 style="font-size: 31px;
            color: black; margin-left: 30px">
                <div>Team 4</div>
            </h3>
        </header>


"""),format.raw/*32.30*/("""
"""),format.raw/*33.53*/("""
"""),format.raw/*34.45*/("""
"""),format.raw/*35.91*/("""

"""),format.raw/*37.46*/("""
"""),format.raw/*38.66*/("""

"""),format.raw/*40.103*/("""
"""),format.raw/*41.75*/("""
"""),format.raw/*42.39*/("""
"""),format.raw/*43.35*/("""
"""),format.raw/*44.46*/("""
"""),format.raw/*45.66*/("""

"""),format.raw/*47.107*/("""
"""),format.raw/*48.75*/("""
"""),format.raw/*49.39*/("""
"""),format.raw/*50.35*/("""
"""),format.raw/*51.58*/("""
"""),format.raw/*52.79*/("""
"""),format.raw/*53.50*/("""
"""),format.raw/*54.39*/("""
"""),format.raw/*55.37*/("""
"""),format.raw/*56.30*/("""
"""),format.raw/*57.46*/("""
"""),format.raw/*58.122*/("""
"""),format.raw/*59.35*/("""
"""),format.raw/*60.83*/("""
"""),format.raw/*61.32*/("""
"""),format.raw/*62.27*/("""
"""),format.raw/*63.23*/("""
"""),format.raw/*64.19*/("""
    """),format.raw/*65.5*/("""<div class="row">
        <div class="card col s4 offset-s4 ">
            <div class="card-panel">
                <div class="row">
                    <div class="input-field col s12">
                        <input id="textField" type="text">
                        <label for="textField">Enter Term</label>
                    </div>
                    <button class="btn col s4 offset-s4" onclick="document.getElementById('div').innerHTML =
                            document.getElementById('textField').value"> Enter</button>
                    <button class="btn col s4 offset-s4" style="margin-top: 9px" onclick="document.getElementById('div').innerHTML = ''"> Reset</button>
                </div>
                <h3><div id="div"></div></h3>
            </div>
        </div>
    </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-01T17:52:02.159
                  SOURCE: /Users/loganschmitt/Documents/Lab-2-Ebean/Frontend/app/views/login.scala.html
                  HASH: 12f213cdba0bab3c560e3fd765e5d29c55d8f224
                  MATRIX: 948->1|1068->28|2671->1634|2700->1687|2729->1732|2758->1823|2788->1870|2817->1936|2848->2040|2877->2115|2906->2154|2935->2189|2964->2235|2993->2301|3024->2409|3053->2484|3082->2523|3111->2558|3140->2616|3169->2695|3198->2745|3227->2784|3256->2821|3285->2851|3314->2897|3344->3019|3373->3054|3402->3137|3431->3169|3460->3196|3489->3219|3518->3238|3550->3243
                  LINES: 28->1|33->2|63->32|64->33|65->34|66->35|68->37|69->38|71->40|72->41|73->42|74->43|75->44|76->45|78->47|79->48|80->49|81->50|82->51|83->52|84->53|85->54|86->55|87->56|88->57|89->58|90->59|91->60|92->61|93->62|94->63|95->64|96->65
                  -- GENERATED --
              */
          