
@numbers = [
[ " -",
  "| |",
  "  ",
  "| |",
  " -" ],
[ "  ",
  "  |",
  "  ",
  "  |",
  "  " ],
[ " -",
  "  |",
  " -",
  "|  ",
  " -" ],
[ " -",
  "  |",
  " -",
  "  |",
  " -" ],
[ "  ",
  "| |",
  " -",
  "  |",
  "  " ],
[ " -",
  "|  ",
  " -",
  "  |",
  " -" ],  
[ " -",
  "|  ",
  " -",
  "| |",
  " -" ],
[ " -",
  "  |",
  "  ",
  "  |",
  "  " ],
[ " -",
  "| |",
  " -",
  "| |",
  " -" ], 
[ " -",
  "| |",
  " -",
  "  |",
  " -" ]]  
  
def enlarge_row (row, digits,factor)
  row_string = ""
  if (row % 2 == 0) then
    for i in 0..digits.length - 1
        row_string =   row_string + ((@numbers[digits[i].chr.to_i][row] * factor) + '   ')
    end
  else
    for i in 0..digits.length - 1
      token = @numbers[digits[i].chr.to_i][row]
      token[1,1] = '  ' * factor 
      row_string += (token + ' ')
    end
  end
  return row_string
end

def enlarge_numbers(digits, factor)
  enlarged_numbers = ""
  for row in (0..4)
    if (row % 2 == 0) then    
      enlarged_numbers += enlarge_row(row, digits, factor) + "\n"
    else
      enlarged_numbers += (enlarge_row(row, digits, factor) + "\n") * factor
    end
  end
  puts enlarged_numbers
end

@digits = ""
@factor = 2;
if (ARGV[0] == '-s') then
  @factor = ARGV[1].to_i
  @digits = ARGV[2]
else
  @digits = ARGV[2]
end

enlarge_numbers(@digits,@factor)