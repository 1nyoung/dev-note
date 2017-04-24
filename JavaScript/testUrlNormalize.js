/**
 * Created by alleysintern on 2017. 4. 18..
 */
const normalizeUrl = require('normalize-url');



console.log(normalizeUrl('http://www.naver.com/'))
console.log(normalizeUrl('http://www.daum.com/', {stripWWW: false}))

normalizeUrl

// var url = require('url');
//
// var parsedObject = url.parse('https://opentutorials.org/module/938/7369/')
//
// console.log(parsedObject)