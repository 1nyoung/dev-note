/**
 * Created by alleysintern on 2017. 4. 19..
 */

var arr = [
    {"name":"apple", "count": 2},
    {"name":"orange", "count": 5},
    {"name":"pear", "count": 3},
    {"name":"orange"}
];
var newArr = arr.filter(function(item){
    return item.count == undefined;
});
console.log("Filter results:",newArr);