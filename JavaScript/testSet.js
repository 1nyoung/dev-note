/**
 * Created by alleysintern on 2017. 6. 02..
 * 두개의 배열 중복 제거
 */
var aa = ['a','a','b','b']

var ss = new Set(aa)

//console.log(ss)


var bb = ['b', 'c']

var sss = new Set(aa.concat(bb))

console.log(sss)
console.log(Array.isArray(sss))

console.log(Array.from(sss))
