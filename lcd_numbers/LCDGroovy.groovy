/**
 * Created by IntelliJ IDEA.
 * User: sujan
 * Date: May 3, 2009
 * Time: 5:09:15 PM
 * To change this template use File | Settings | File Templates.
 */

patterns = [];

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

String value = "0123456789"
size = 1

valueArray = []
value.each {digit -> valueArray << Integer.parseInt(digit)}

StringBuffer firstLine = new StringBuffer();
StringBuffer secondLine = new StringBuffer();
StringBuffer thirdLine = new StringBuffer();

//creating first line
for (int i = 0; i < valueArray.size(); i++) {
    firstLine.append "  "
    for (int j = 0; j < size; j++) {
        firstLine.append patterns.get(valueArray[i])[1]
    }
    firstLine.append " "
}
firstLine.append "\n"





//creating second line
for (int j = 0; j < size; j++) {

    StringBuffer emptyLine = new StringBuffer();

    for (int k = 0; k < size; k++) {
        emptyLine.append " "
    }

    for (int i = 0; i < valueArray.size(); i++) {
        StringBuffer middlePart = new StringBuffer();
        secondLine.append " " + patterns.get(valueArray[i])[3]
        if (size - 1 == j) {
            for (int k = 0; k < size; k++) {
                middlePart.append patterns.get(valueArray[i])[4]
            }
            secondLine.append middlePart
        } else {
            secondLine.append emptyLine
        }
        secondLine.append patterns.get(valueArray[i])[5]
    }
    secondLine.append "\n"
}


//creating third line
for (int j = 0; j < size; j++) {

    StringBuffer emptyLine = new StringBuffer();

    for (int k = 0; k < size; k++) {
        emptyLine.append " "
    }

    for (int i = 0; i < valueArray.size(); i++) {
        StringBuffer middlePart = new StringBuffer();
        thirdLine.append " " + patterns.get(valueArray[i])[6]
        if (size - 1 == j) {
            for (int k = 0; k < size; k++) {
                middlePart.append patterns.get(valueArray[i])[7]
            }
            thirdLine.append middlePart
        } else {
            thirdLine.append emptyLine
        }
        thirdLine.append patterns.get(valueArray[i])[8]
    }
    thirdLine.append "\n"
}

println firstLine.append(secondLine).append(thirdLine)
