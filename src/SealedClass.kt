import javax.sound.midi.MetaMessage

sealed class NetworkResult{

    data class Success(val data: String): NetworkResult()
    data class Error(val message: String, val code: Int): NetworkResult()
    object Loadinbg: NetworkResult()
}

fun handleResult(result: NetworkResult){
    when(result){
        is NetworkResult.Success->{
            println("Успех: ${result.data}")
        }
    }
}