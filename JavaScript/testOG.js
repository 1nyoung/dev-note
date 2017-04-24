/**
 * Created by alleysintern on 2017. 4. 18..
 */
// var og = require('open-graph')
//
//
// var url = 'http://m.post.naver.com/viewer/postView.nhn?volumeNo=5061847&memberNo=7436453&navigationType=push'
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

var url = 'http://blog.naver.com/wddjiy777/220852800041'
var options = {'url': url};
ogs(options, function (err, meta) {
    console.log('err:', err); // This is returns true or false. True if there was a error. The error it self is inside the results object.
    //console.log('results:', results);
    console.log(meta.data.ogUrl)
    console.log(meta.data.ogImage.url)
    console.log(meta.data.ogTitle)
    console.log(meta.data.ogDescription)
});

