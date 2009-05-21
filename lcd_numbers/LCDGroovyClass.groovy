package quiz2
/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: May 3, 2009
 * Time: 8:10:06 PM
 * To change this template use File | Settings | File Templates.
 */
class LCDGroovyClass {

    static def patterns = [];
    static String value = "0123456789"
    static int size = 1
    static def valueArray = []

    static void init() {
        patterns << [" ", "_", " ", "|", " ", "|", "|", "_", "|"];
        patterns << [" ", " ", " ", " ", " ", "|", " ", " ", "|"];
        patterns << [" ", "_", " ", " ", "_", "|", "|", "_", " "];
        patterns << [" ", "_", " ", " ", "_", "|", " ", "_", "|"];
        patterns << [" ", " ", " ", "|", "_", "|", " ", " ", "|"];
        patterns << [" ", "_", " ", "|", "_", " ", " ", "_", "|"];
        patterns << [" ", "_", " ", "|", "_", " ", "|", "_", "|"];
        patterns << [" ", "_", " ", " ", " ", "|", " ", " ", "|"];
        patterns << [" ", "_", " ", "|", "_", "|", "|", "_", "|"];
        patterns << [" ", "_", " ", "|", "_", "|", " ", " ", "|"];

        value.each {digit -> valueArray << Integer.parseInt(digit)}
    }

    static String createLine(int start){
        StringBuffer result = new StringBuffer()
        for (j in 1..size) {

            StringBuffer emptyLine = new StringBuffer();

            for(k in 1..size){
                emptyLine.append " "
            }

            for (i in 1..valueArray.size()) {
                StringBuffer middlePart = new StringBuffer();
                result.append " " + patterns.get(valueArray[i-1])[start]
                if (size == j) {
                    for (k in 1..size) {
                        middlePart.append patterns.get(valueArray[i-1])[start+1]
                    }
                    result.append middlePart
                } else {
                    result.append emptyLine
                }
                result.append patterns.get(valueArray[i-1])[start+2]
            }
            result.append "\n"
        }

        return result.toString()

    }

    static void main(args){
        init()
        println createLine(0) + createLine(3) + createLine(6)
    }

}
