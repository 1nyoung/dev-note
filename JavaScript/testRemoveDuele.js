/**
 * Created by alleysintern on 2017. 6. 8..
 */


var or = [
    {
        name: "a",
        age: 22
    },
    {
        name: "b",
        age: 33
    },
    {
        name: "c",
        age: 44
    }
]

var ne = [
    {
        name: "a",
        age: 44
    },
    {
        name: "c",
        age: 55
    },
    {
        name: "d",
        age: 66
    }
]


//두개를 합쳐서 [{name: "A", age: 22},{name: "B", age: 44},{name: "C", age: 55}, {name: "d", age: 88}]

// for(var i = 0; i < ne.length; i++){
//     console.log(or.findIndex(function (obj) {
//         console.log(obj)
//         // console.log('------------------')
//         // console.log(ne[i].name)
//         // console.log('------------------')
//         // return obj.name === ne[i].name
//     }))
// }

// a = [
//     {prop1:"abc",prop2:"qwe"},
//     {prop1:"bnmb",prop2:"yutu"},
//     {prop1:"zxvz",prop2:"qwrq"}];
//
// index = a.findIndex(function (x) {
//     console.log('hihi')
//     console.log(x)
//     return x.prop2 =="yutu"
//
// })
// console.log(index);


// for (var i = 0; i < or.length; i++) {
//     for (var j = 0; j < ne.length; j++) {
//         //console.log('i:' + i + '      j: ' + j)
//         if (or[i].name === ne[j].name) {
//             or.splice(or.findIndex(function (obj) {return obj.name === or[i].name}),1)
//             console.log(or)
//         }
//     }
// }
// console.log(or)

// or.findIndex(function (obj) {
//     console.log('====')
//     console.log(obj)
//     return obj.name === 'b'
// })


ne.map(function (obj1, idx1, arr) {
    var removeIdx = or.findIndex(function (obj, idx2) {return obj.name === obj1.name})

    if(removeIdx === -1) return
    or.splice(removeIdx,1)
})
console.log(or.concat(ne))



// ne.map(function (objne, idx, arr) {
//     or.splice()
//     console.log(    or.findIndex(function (obj) {
//         console.log(obj)
//         return obj.name === objne.name
//     }))
//
// })


// var arr = or.concat(ne)
// console.log(arr)
//
// arr.map(function (obj, idx, arr) {
//     console.log(idx)
//
//     // if(obj.name === arr[idx-1].name){
//     //     console.log(true)
//     //     console.log(idx)
//     // }
// })

