/**
 * Created by alleysintern on 2017. 4. 27..
 */

var arr = { 'id': 'wddjiy777', 'pwd': '1234', 'pois': [] }

// console.log(arr)
//
// if(arr){
//     console.log('hi')
// }else {
//     console.log('hello')
// }

if(arr.pois.length == 0){
    console.log('hi')
}else {
    console.log('hello')
}

console.log(typeof arr.pois)

//타입 에러가 발생했었다 필드값이 []도 아니고 선언만 되어있을때 어쩌피 &&는 false가 나오면 바로 else로 넘어감 일단은 존재하는지 부터 먼저 판단하고 length를 봐야함 그렇지 못했기 때문에 타입 에러 발생
