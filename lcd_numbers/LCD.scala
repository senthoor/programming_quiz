/*
 * LCD.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package scalaapplication19

import scala.collection.mutable.Map

object LCD extends Application{
    val numbers = Map[char ,Array[String]]()
    numbers += ('1' -> Array("   ", "  |", "   ", "  |", "   "))
    numbers += ('2' -> Array(" - ", "  |", " - ", "|  ", " - "))
    numbers += ('3' -> Array(" - ", "  |", " - ", "  |", " - "))
    numbers += ('4' -> Array("   ", "| |", " - ", "  |", "   "))
    numbers += ('5' -> Array(" - ", "|  ", " - ", "  |", " - "))
    numbers += ('6' -> Array(" - ", "|  ", " - ", "| |", " - "))
    numbers += ('7' -> Array(" - ", "  |", "   ", "  |", "   "))
    numbers += ('8' -> Array(" - ", "| |", " - ", "| |", " - "))
    numbers += ('9' -> Array(" - ", "| |", " - ", "  |", " - "))
    numbers += ('0' -> Array(" - ", "| |", "   ", "| |", " - "))

    implicit def convert(s:String) = new StringWrapper(s)

    println("Enter the number")
    val number = Console.readLine

    println(" Enter the Scale Factor :")
    val scaleFactor = Console.readInt

    println(getProcessedString(number, scaleFactor));

    def getProcessedString(number:String, sacelFactor:int):String ={
        val charArray = number.toCharArray

         val finalString =
         for (i <-0 to 4 ) yield{
            val test =
                for (charValue <- charArray) yield{
                    numbers(charValue)(i)
                }
            test.mkString(":").multy(scaleFactor)
         }

        finalString.mkString("\n")

    }
}

class StringWrapper(s:String) {
  def multy(scaleFactor:int):String = {
        if (s.contains("|")) {
            val results = for (i <- 1 to scaleFactor ) yield{ 
            val itemString = s.split(":")
            val resultString =
            for (item <- itemString) yield{
                item.charAt(0).toString + item.substring(1, item.length-1)*(scaleFactor*3 -2) + item.charAt(item.length -1 ).toString
            }
            val finalString = resultString.mkString("\t")
            finalString
            }
            results.mkString("\n")
        } else {
            val itemString = s.split(":")
            val resultString =
            for (testing <- itemString) yield{
               testing*scaleFactor
            }
            val finalString = resultString.mkString("\t")
            finalString
        }
    }
}
