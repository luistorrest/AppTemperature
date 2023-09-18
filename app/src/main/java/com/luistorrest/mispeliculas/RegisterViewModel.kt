import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class RegisterViewModel : ViewModel() {

    val kelvin: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }
    private val _errorMsg : MutableLiveData<String> = MutableLiveData()
    val errorMsg : LiveData<String> = _errorMsg

    fun convertirGrados(celsius: String) {

        if (celsius.isEmpty()) {
            _errorMsg.value ="Debe Digitar algún número"
        }else{
             kelvin.value = celsius.toDouble() + 273.15

        }
    }
}
