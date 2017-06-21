/**
 * Created by alleysintern on 2017. 4. 18..
 */
var og = require('open-graph')


// var url = 'https://medium.com/@Alleys'
// og(url, function (err, meta) {
//     if(err){
//         console.log('err')
//         return
//     }
//
//     console.log(meta)
//
// })

var ogs = require('open-graph-scraper')

var url = 'http://blog.naver.com/wddjiy777zzzzz'
var options = {'url': url};
ogs(options, function (err, meta) {
    if(err){
        console.log('err' + err)
        //console.log(err)
        return
    }
    console.log(meta)

});

