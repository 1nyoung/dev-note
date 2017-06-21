var async = require('async')

async.waterfall([
    function(callback){
        callback(null, '하나', '둘');
    },
    function(arg1, arg2, callback){
        if(true){
            callback('error');
            return
        }
        // arg1는 '하나'고, arg2는 '둘'이다.
        callback(null, '셋');
    },
    function(arg1, callback){
        // arg1은 '셋'이다.
        callback(null, '끝');
    }
], function (err, result) {
    if(err){
        console.log('error')
        console.log(err)
        console.log(result)
        return
    }
    console.log('ok')
    console.log(err)
    console.log(result)
});