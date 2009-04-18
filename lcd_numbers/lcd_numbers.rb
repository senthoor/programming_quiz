
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
  " - " ], 
[ " - ",
  "| |",
  " - ",
  "  |",
  " - " ]]  
  
def enlarge (token,factor)
    key = String.new(token) 
    for i in (1..factor-1) 
      if key.strip == '-' then
         return token * factor
      else
        key[1,1] += "   " 
        token = (key + "\n") * factor
      end
    end
    return token
end
    
numbers.each {|x| x.each { |y|  puts enlarge(y,8)}}
                           