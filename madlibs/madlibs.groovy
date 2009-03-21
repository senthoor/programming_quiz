sentence = ["Our favorite language is ((gem:a gemstone)). We think ((gem)) is better than ((a gemstone))"]
found = []
map = [:]
sentence.last().eachMatch(/\(\(\w+:[\w\s]*\)\)/) {match -> map.put(match[0].substring(2,match[0].indexOf(':')),match[0].substring(match[0].indexOf(':')+1,match[0].size()-2))}
sentence.last().eachMatch(/\(\([\w\s]*\)\)/) {match -> found << match[0].substring(2,match[0].size()-2)}
found.each {item -> if(map.containsKey(item)){print map[item]+" - "} else{print item+" - " };sentence << sentence.last().replaceAll(/\(\($item:?[\w\s]*\)\)/ , new InputStreamReader(System.in).readLine())}
println sentence.last()
