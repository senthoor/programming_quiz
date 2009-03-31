
numbers = [
[ "   ",
  "  |",
  "   ",
  "  |",
  "   " ],
[ " - ",
  "  |",
  " - ",
  "|  ",
  " - " ],
[ " - ",
  "  |",
  " - ",
  "  |",
  " - " ],
[ "  ",
  "| |",
  " - ",
  "  |",
  "   " ],
[ " - ",
  "|  ",
  " - ",
  "  |",
  " - " ],  
[ " - ",
  "|  ",
  " - ",
  "| |",
  " - " ],
[ " - ",
  "  |",
  "  ",
  "  |",
  "   " ],
[ " - ",
  "| |",
  " - ",
  "| |",
  " -  " ], 
[ " - ",
  "| |",
  " - ",
  "  |",
    " -  " ]]  
def enlarge (token,factor)
    key = String.new(token) 
    for i in (1..factor-1) 
      if key.strip == '-' then
        token = token + key.strip
      else
        key[1,1] = " " * factor
        token = key + "\n" + key + "\n"
      end
    end
    return token
end
    
numbers.each {|x| x.each { |y|  puts enlarge(y,3)}}

