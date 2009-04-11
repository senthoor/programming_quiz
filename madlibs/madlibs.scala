package quiz.madlibs

import java.util.regex.{Pattern, Matcher}
import scala.util.matching.Regex;

object madlibs extends Application {  
  var msg = "Our favorite language is ((gem:a gemstone)). We think ((gem)) is better than ((a gemstone))" +
  "I ((a verb, past tense)) to the sandwich shop across the street for lunch " +
" yesterday. I go there at least ((a number)) times a week. They have the best"+
" Philly Cheesesteak, full of ((a plural noun)) and ((a plural noun)) and gooey,"+
" stringy ((a noun)). They prepare it just right, ((a verb ending in ing)) it"+
" until the meat breaks up and browns, but is still ((an adjective)) and juicy."+
" Then they add special ((a plural noun)) and place two pieces of delicious ((a"+
" color)) provolone cheese on top of the meat. As soon as it melts, they scoop the"+
" whole thing up and plop it on a ((an adverb)) toasted bun.  The juice ((a verb"+
" ending in s)) into the bread and runs down your ((a body part)) when you bite"+
" into it. Perfect! My mouth was watering just thinking about it. I ((an adverb))"+
" placed my order, dreaming of my Cheesesteak sandwich. As soon as it was ready, I"+
"((a verb, past tense)) back to my office and settled down to savor every mouth"+
" watering bite.  But, wouldn't you know, they'd given me a ((a noun)) on rye"+
" instead!"

  val reg1 = new Regex("\\(\\([^(\\)\\))]*:[^(\\)\\))]*\\)\\)")

  val matchIterator = reg1.findAllIn(msg)
  while(matchIterator.hasNext) {
      val test = matchIterator.next;
      println( "Enter : " + test.substring(test.indexOf(":") + 1, test.length-2))
      val input = Console.readLine
      msg = msg.replaceFirst(reg1.toString, input)
      msg = msg.replaceAll("\\(\\(" + test.substring(2, test.indexOf(":")) + "\\)\\)", input)
  }

    val reg = new Regex("\\(\\([^(\\)\\))]*\\)\\)")
    var condition  = true;
    while(condition) {
       reg.findFirstIn(msg) match {
            case None => condition = false;println(msg)
            case Some(x) => {println("Enter " +  x.substring(2, x.length-2))
                             msg = msg.replaceFirst(reg.toString, Console.readLine)}
        }
       
    }


}
