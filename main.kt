fun main(){
    //var count = 0
   // var MyArray = arrayOf<String>("Ice Cream", "Ice cream Scoop", "Ice Cream Cone", "Spoons", "Napkins")
   // for (count in MyArray){
   //     println(count)
    // }

    var items = arrayOf("Ice Cream Buckets", "Ice Cream Scoop", "Ice cream Cones", "Cups", "Spoons", "Napkins" )
    var qty = arrayOf("50", "5", "100", "100", "75", "500")

    var inv = arrayOf<Array<String>>(items, qty)
    var rowcount = inv[0].size -1

    for (i in 0..rowcount){
        var item_Name = inv[0][i]
        var item_qty = inv[1][i]
        println("Item number $i: $item_Name Quantity: $item_qty")
    }
}