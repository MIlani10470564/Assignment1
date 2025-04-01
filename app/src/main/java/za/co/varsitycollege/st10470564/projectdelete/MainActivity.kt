package za.co.varsitycollege.st10470564.projectdelete

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editUserText = findViewById<EditText>(R.id.editTextText)
        val buttonGenerate = findViewById<Button>(R.id.buttonGenerate)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val textViewOutput = findViewById<TextView>(R.id.textMeals)
        buttonGenerate.setOnClickListener {
            var input = editUserText.text.toString().trim().lowercase()

            //set up button click listeners

            buttonGenerate.setOnClickListener {
                val input = editUserText.text.toString().trim().lowercase()
                val suggestion = when (input) {
                    "morning" -> "Breakfast: flapJacks and caramel Sauce"
                    "Afternoon" -> "gatsby with scones"
                    "Mid-Afternoon" -> "Snack: Yogurt with Granola and berries"
                    "dinner" -> "Dinner: chicken chow mein"
                    else -> "Please enter valid:\n(morning, afternoon,Mid-Afternoon,Dinner)"
                }
                textViewOutput.text = suggestion
            }
            buttonClear.setOnClickListener {
                editUserText.text.clear()
                textViewOutput.text = ""

            }
        }


    }

}