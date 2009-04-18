
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
@digits = ""
@factor = 2;
if (ARGV[0] == '-s') then
  @factor = ARGV[1].to_i
  @digits = ARGV[2]
else
  @digits = ARGV[2]
end

@digits.each_char {|x| enlarge_number(@numbers[x.to_i],@factor)}