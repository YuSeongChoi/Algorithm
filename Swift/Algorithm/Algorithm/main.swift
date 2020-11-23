import Foundation

var n: Int = 1260
var count:Int = 0

let coin_types: [Int] = [500, 100, 50, 10]

for coin in coin_types {
    count = count + (n/coin)
    n = n % coin
}

print(count)
