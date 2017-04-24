/**
 * Created by alleysintern on 2017. 4. 19..
 * if문에서 return시 어느곳으로
 */


function test() {
    if(true){
        if(true){
            console.log('a')

        }
        console.log('b')
        return
    }

    console.log('c')
}

test()