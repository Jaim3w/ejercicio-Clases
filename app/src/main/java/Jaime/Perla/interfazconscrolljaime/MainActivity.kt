package Jaime.Perla.interfazconscrolljaime

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txtEdad = findViewById<EditText>(R.id.txtEdad)
        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtApellido = findViewById<EditText>(R.id.txtApellido)
        val txtProfesion = findViewById<EditText>(R.id.txtProfesion)
        val txtNumeroTarjeta = findViewById<EditText>(R.id.txtNumeroTarjeta)
        val txtDireccion = findViewById<EditText>(R.id.txtDireccion)
        val txtEstadoCivil = findViewById<EditText>(R.id.txtEstadoCivil)
        val txtTipoSangre = findViewById<EditText>(R.id.txtTipoSangre)
        val txtTelefono = findViewById<EditText>(R.id.txtTelefono)
        val txtPeso = findViewById<EditText>(R.id.txtPeso)
        val txtNacionalidad = findViewById<EditText>(R.id.txtNacionalidad)
        val txtDui = findViewById<EditText>(R.id.txtDui)
        val txtAltura = findViewById<EditText>(R.id.txtAltura)
        val btnGuardar = findViewById<Button>(R.id.btnIngresarDatos)

        btnGuardar.setOnClickListener {

            if (txtEdad.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese la edad", Toast.LENGTH_SHORT).show()
            }
            if (txtNombre.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el nombre", Toast.LENGTH_SHORT).show()
            }
            if (txtApellido.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el apellido", Toast.LENGTH_SHORT).show()
            }
            if (txtProfesion.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese la profesion", Toast.LENGTH_SHORT).show()
            }
            if (txtNumeroTarjeta.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el numero de tarjeta", Toast.LENGTH_SHORT).show()
            }
            if (txtDireccion.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese la direccion", Toast.LENGTH_SHORT).show()
            }
            if (txtEstadoCivil.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el estado civil", Toast.LENGTH_SHORT).show()
            }
            if (txtTipoSangre.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el tipo de sangre", Toast.LENGTH_SHORT).show()
            }
            if (txtTelefono.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el telefono", Toast.LENGTH_SHORT).show()
            }
            if (txtPeso.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el peso", Toast.LENGTH_SHORT).show()
            }
            if (txtNacionalidad.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese la nacionalidad", Toast.LENGTH_SHORT).show()
            }
            if (txtDui.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el Dui", Toast.LENGTH_SHORT).show()
            }
            if (txtAltura.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese la altura", Toast.LENGTH_SHORT).show()
            }
            if (txtDui.text.toString().isEmpty()) {
                Toast.makeText(this, "Ingrese el Dui", Toast.LENGTH_SHORT).show()
            }
            if (txtEdad.text.toString().toInt() < 18 && txtEdad.text.toString().toInt() >= 120) {
                Toast.makeText(this, "Ingrese una edad valida", Toast.LENGTH_SHORT).show()
            }
        }
    }
}