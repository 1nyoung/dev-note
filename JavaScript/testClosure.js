/**
 * Created by alleysintern on 2017. 4. 13..
 */

var a = []

for(var i=0; i<3; i++){
    console.log('hi')
    !function (id) {
      a[id] = id
    }(i)
}

console.log(a)


// var a = []
//
// for(var i=0; i<3; i++){
//     a[i] = i
// }
//
// console.log(a)