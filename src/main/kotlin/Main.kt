fun main(){
var myStack = Stack()
    var string = "adalab"
    for (c in string){
    myStack.push(c)
    }
    var result = mutableListOf<Char>()
    while (!myStack.isEmpty()){
        result.add(myStack.pop()!!)
    }
    println(result.joinToString(""))

}

class Stack{
    var data = mutableListOf<Char>()

    fun push(value:Char){
        data.add(value)
    }

    fun pop():Char?{
        if(data.isEmpty()){
            return null
        }

        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }

    fun peek():Char?{
        if(data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }
}