/**
 * Created by alleysintern on 2017. 4. 21..
 */


// 순서대로 true면 true false면 계속 비교
// 하나라도 true면 ture
console.log(true || true || false)
console.log(false || false || true)


// 순서대로 true면 계속 비교 false면 false
// 다 true일때 true
console.log(true && true && false)
console.log(false && true && true)

console.log(true && true)
console.log(false && true)