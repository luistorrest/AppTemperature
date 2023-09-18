import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel


class RegisterViewModel : ViewModel() {
    fun convertirGrados(celsius: String) {

        if (celsius.isEmpty()) {
            Log.d("Error","Empty")
        }else{
            var kelvin = celsius.toDouble() + 273.15
            Log.d("Kelvin",kelvin.toString())
            //Toast.makeText(this,"Se ha convertido los grados a kelvin",Toast.LENGTH_LONG).show()
        }
    }
}
