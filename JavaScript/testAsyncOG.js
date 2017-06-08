/**
 * Created by alleysintern on 2017. 6. 5..
 */


var ogs = require('open-graph-scraper')
var util = require('util')


var url = 'https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/isFinite'
var options = {'url': url};

function OG(callback) {
    ogs(options, function (err, meta) {
        if(err){
            console.log(err)
            return
        }
        callback(meta)
    });
}

var result = "결과 : "

OG(function (meta) {
    console.log(result+ util.inspect(meta))
})
