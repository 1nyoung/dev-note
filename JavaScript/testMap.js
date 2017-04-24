/**
 * Created by alleysintern on 2017. 4. 19..
 */


var a = [5,6,7,8,9];

var c = a.map( function(v,i,a){
    console.log(v);
    console.log(a)
    return 0;
});



console.log(c)



// var kvArray = [{key:1, value:10}, {key:2, value:20}, {key:3, value: 30}];
// var reformattedArray = kvArray.map(function(obj){
//     var rObj = {};
//     rObj[obj.key] = obj.value;
//     return rObj;
// });
//
//
//
// console.log(reformattedArray)
//
//
// for(var i = 0; i < route.pois.length; i++){
//     funcs[i] = function (id) {
//         return function (callback) {
//             db.poi.getById(route.pois[id].id, function (err, poi) {
//                 route.pois[id].poi = poi
//                 callback(null)
//             })
//         }
//     }(i)
// }
//
// async.parallel(funcs, function (err) {
//     if(err){
//         res.err(err)
//         return
//     }
//
//     res.ok(route)
// })
//
//
// var funcs = route.pois.map(function (obj, id) {
//     db.poi.getById(obj.id, function (err, poi) {
//         if (err) {
//             callback(err)
//             return
//         }
//         if(!poi){
//             return
//         }
//         obj.poi = poi
//         //callback(null)
//     })
// })
//
// funcs = funcs.filter(function (item) {
//     return item.poi !== undefined
// })
//
// route.
