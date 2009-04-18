
@numbers = [
[ " - ",
  "| |",
  "   ",
  "| |",
  " - " ],
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
  
def enlarge_token (token,factor)
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

def enlarge_number(number, factor)
  number.each {|x| puts enlarge_token(x, factor)}
end

if (ARGV[1] == '-s') then
  factor = ARGV[2]
  digits = ARGV[3]
else
  factor = 2
  digits = ARGV[2]
end
    
    
enlarge_number(@numbers[2],8)
                           