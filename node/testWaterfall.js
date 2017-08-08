/**
 * Created by inyoung on 2017-08-08.
 */
var async = require('async')

async.waterfall([
    function(callback){
        //callback(null, '하나', '둘');
        return
    },
    function(arg1, arg2, callback){

        callback(null, '셋');
    },
    function(arg1, callback){

        callback(null, '끝');
    }
], function (err, result) {
    if(err){
        console.log(err)
    }

    console.log(result)
});

console.log('hi')