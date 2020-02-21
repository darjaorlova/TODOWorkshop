package lt.workshop.todo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        save.setOnClickListener {
            val text = task.text.toString()
            val newTask = Task(text)
            Database.add(newTask)
            finish()
        }
    }
}