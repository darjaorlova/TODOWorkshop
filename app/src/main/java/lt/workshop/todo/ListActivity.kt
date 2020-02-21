package lt.workshop.todo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    private val adapter = TaskAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        add.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }

        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
    }

    override fun onStart() {
        super.onStart()

        adapter.set(Database.get())
    }
}