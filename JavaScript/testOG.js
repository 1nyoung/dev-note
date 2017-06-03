/**
 * Created by alleysintern on 2017. 4. 18..
 */
var og = require('open-graph')


var url = 'https://medium.com/@Alleys'
og(url, function (err, meta) {
    if(err){
        console.log('err')
        return
    }

    console.log(meta)

})

var ogs = require('open-graph-scraper')

var url = 'https://youtu.be/jPFDO_0lvkw'
var options = {'url': url};
ogs(options, function (err, meta) {
    console.log('err:', err); // This is returns true or false. True if there was a error. The error it self is inside the results object.
    //console.log('results:', results);
    console.log(meta)
     //console.log(meta.data.ogUrl)
    // console.log(meta.data.ogImage.url)
    // console.log(meta.data.ogTitle)
    // console.log(meta.data.ogDescription)
});

