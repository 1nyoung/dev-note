/**
 * Created by alleysintern on 2017. 4. 17..
 * "" vs undefined vs array
 */


// var j = {
//     og: 'hihi'
// }
// var i
// function test() {
//     if(i !== undefined){
//         console.log('A')
//     }else{
//         console.log('B')
//         if(true){
//             console.log('C')
//             return
//         }
//
//     }
//     console.log('bye')
// }
//
// test()
// console.log('ggggg')


var aa = null
var ss = ""
var dd
var oo = []







console.log(!aa)
console.log(aa === null)
console.log(aa == undefined)
console.log(aa == 0)
console.log(typeof aa)

console.log('======================')


console.log(!ss)
console.log(ss === null)
console.log(ss == undefined)
console.log(ss == 0)
console.log(typeof ss)

console.log('======================')

console.log(dd)
console.log(!dd)
console.log(dd == null) // 요고
console.log(dd == undefined) //요고
console.log(dd == 0)
console.log(typeof dd)

console.log('======================')

console.log(!oo) //빈배열은 없는게 아니다
console.log(oo == null)
console.log(oo == undefined)
console.log(oo == 0)
console.log(oo.length == 0)
console.log(typeof oo)
console.log(Array.isArray(oo))


/*
 "" 빈배열은 없는게 아니다
 */

