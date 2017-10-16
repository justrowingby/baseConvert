input: I10, n
output: In

baseConvert(int: input, to: n)
if(n < 2)
    error
if(i == 0)
    return 0
if(i < 0)
    sign = negative
    i = -i
while (i != 0)
    r = i % n
    in = r.toString + in
    i -= r
    i /= n
if(sign == negative)
    in = "-" + in
return in
