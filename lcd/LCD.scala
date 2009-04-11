/*
 * Main.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

object LCD {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]) = {
              implicit def converts(s: String) = new StringWrapper(s)

    def draw(letter:Char, scaleFactor:int) =
        letter match {
          case ('0') => { " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                                              "| |".multy(scaleFactor)
                                             " ".multy(scaleFactor);" ".multy(scaleFactor);println()
                                              "| |".multy(scaleFactor)
                                              " ".multy(1);"-".multy(scaleFactor);" ".multy(1)
          }
          case ('1') => { 
                                              " |".multy(scaleFactor)
                                              " |".multy(scaleFactor)
                                              
                                             
          }
          case ('2') => { " ".multy(1);"-".multy(scaleFactor);println()
                           " |".multy(scaleFactor)
                                              " ".multy(1); "-".multy(scaleFactor);println()
                                              "| ".multy(scaleFactor)
                                              " ".multy(1);"-".multy(scaleFactor)

          }
          case ('3') => { " ".multy(1);"-".multy(scaleFactor);println()
                          " |".multy(scaleFactor)
                          " ".multy(1);"-".multy(scaleFactor);println()
                          " |".multy(scaleFactor)
                          " ".multy(1);"-".multy(scaleFactor);println()

          }
          case ('4') => { 
                          "| |".multy(scaleFactor)
                          " ".multy(1);"-".multy(scaleFactor);println()
                          " |".multy(scaleFactor)
                          
          }
          case ('5') => { " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                        "| ".multy(scaleFactor)
                        " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                        " |".multy(scaleFactor)
                         " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
         
          }
          case ('6') => { " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                        "| ".multy(scaleFactor)
                        " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                        "| |".multy(scaleFactor)
                         " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()

          }
          case ('7') => {  " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                          " |".multy(scaleFactor)
                          
                          " |".multy(scaleFactor)
                           
          }
          case ('8') => { " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                                              "| |".multy(scaleFactor)
                                              " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                                              "| |".multy(scaleFactor)
                                              " ".multy(1);"-".multy(scaleFactor);" ".multy(1)
          }
          case ('9') => { " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                                              "| |".multy(scaleFactor)
                                              " ".multy(1);"-".multy(scaleFactor);" ".multy(1);println()
                                              " |".multy(scaleFactor)
                                              " ".multy(1);"-".multy(scaleFactor);" ".multy(1)
          }
        }

        println("Enter the Scale Factor : ")
        val t = Console.readInt

            draw('0',t);println
            draw('1',t);println
            draw('2',t);println
            draw('3',t);println
            draw('4',t);println
            draw('5',t);println
            draw('6',t);println
            draw('7',t);println
            draw('8',t);println
            draw('9',t);println


  }

    class StringWrapper(s:String) {
        def multy(scaleFactor:int) = {
            s match {
                case (" ") => print(s * scaleFactor)
                case ("-") => print(s * scaleFactor)
                case _ => {
                        for(i <- 1 to scaleFactor) {
                        for (char <- s.toCharArray) {
                            if (char == '|') {
                                print('|')
                            } else if (char equals ' '){
                                print(" " *(scaleFactor + 1))
                            } else {
                                print(char.toString *scaleFactor)
                            }

                        }
                        println() }
                   }
            }
        }
    }

}
