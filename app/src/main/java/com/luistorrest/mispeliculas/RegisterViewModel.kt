import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class RegisterViewModel : ViewModel() {

    val kelvin: MutableLiveData<Double> by lazy {
        MutableLiveData<Double>()
    }
    fun convertirGrados(celsius: String) {

        if (celsius.isEmpty()) {
            Log.d("Error","Empty")
        }else{
             kelvin.value = celsius.toDouble() + 273.15

        }
    }
}
