/**
 * Created by alleysintern on 2017. 4. 19..
 */
funcs = route.pois.map(function (obj, id) {
    return function (callback) {
        db.poi.getById(obj.id, function (err, poi) {
            if (err) {
                callback(err)
                return
            }
            if(!poi){
                return
            }
            obj.poi = poi
            callback(null)
        })
    }
})
async.parallel(funcs, function (err) {
    if(err){
        res.err(err)
        return
    }
    res.ok(route)
})
// for(var i = 0; i < route.pois.length; i++){
//     funcs[i] = function (id) {
//         return function (callback) {
//             db.poi.getById(route.pois[id].id, function (err, poi) {
//                 if (err) {
//                     callback(err)
//                     return
//                 }
//                 if (!poi) {
//                     route.pois.splice(id,1)
//                     callback(null)
//                     return
//                 }
//
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