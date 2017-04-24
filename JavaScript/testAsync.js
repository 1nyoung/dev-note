/**
 * Created by alleysintern on 2017. 4. 24..
 */
else
{
    async.parallel([
            function (callback) {
                db.poi.getByPId(routee.pois[0].id, function (err, poi) {
                    if (err) {
                        res.err(err)
                        return
                    }
                    if (!poi) {
                        return
                    }
                    routee.pois[0].poi = poi
                    callback(err)
                })

            },
            function (callback) {
                db.poi.getByPId(routee.pois[1].id, function (err, poi) {
                    if (err) {
                        res.err(err)
                        return
                    }
                    if (!poi) {
                        return
                    }
                    console.log('==============')
                    routee.pois[1].poi = poi
                    callback(err)
                })

            }
        ],
        function (err) {
            res.ok(routee)
        }
    )

    var loop = [callback1, callback2].map(function (callback, idx) {
        return function (callback) {
            dblpoi.getByPId()
            )
}
})

}


var B = []
B[0] = function (callback) {
    console.log('1')
    callback(null, 'one')

}
B[1] = function (callback) {
    console.log('2')
    callback(null, 'one')

}
async.parallel(B, function (err, results) {
    console.log('finish')

})

var B = []
for (var i = 0; i < 2; i++) {
    B[i] = function (id) {
        console.log(id)
        return function (callback, id) {
            console.log('id: +' + id)
            console.log('hi')
            callback(null, 'one')
        }
    }(i)
}
async.parallel(B, function (err, results) {
    console.log('finish + ' + results)

})

var B = []
for (var i = 0; i < routee.pois.length; i++) {
    B[i] = function (id) {
        return function (callback) {
            db.poi.getByPId(routee.pois[id].id, function (err, poi) {
                if (err) {
                    res.err(err)
                    return
                }
                if (!poi) {
                    res.ok(routee)
                    return
                }
                routee.pois[id].poi = poi
                callback(null, 'one')
            })
            console.log('hi')
        }
    }(i)
}
async.parallel(B, function (err, results) {
    console.log('finish + ' + results)
    res.ok(routee)

})


for (var i = 0; i < routee.pois.length; i++) {
    console.log('A')

    !function A(id) {
        console.log('요기 + ' + id)
        db.poi.getByPId(routee.pois[id].id, function (err, poi) {
            if (err) {
                console.log('|||||||||||||||')
                res.err(err)
                return
            }
            if (!poi) {
                console.log('===============')
                res.ok(routee)
                return
            }
            console.log('+++++++++++++')
            routee.pois[id].poi = poi
        })
    }(i);


}
process.nextTick(function () {
    console.log('C')
    res.ok(routee)
})


for (var i = 0; i < routee.pois.length; i++) {
    console.log('A')
    !function A(id) {
        console.log('id' + id)
        return function () {
            console.log('요기 + ' + id)
            db.poi.getByPId(routee.pois[id].id, function (err, poi) {
                if (err) {
                    console.log('|||||||||||||||')
                    res.err(err)
                    return
                }
                if (!poi) {
                    console.log('===============')
                    res.ok(routee)
                    return
                }
                console.log('+++++++++++++')
                routee.pois[id].poi = poi
            })
        }()
    }(i);
}
process.nextTick(function () {
    console.log('C')
    res.ok(routee)
})


    for (var i = 0; i < route.pois.length; i++) {
        db.poi.getByPId(route.pois[i].id, function (err, poi) {
            if (err) {
                res.err(err)
                return
            }

            route.pois[i].poi = poi
        })
    }

    res.ok(route)
